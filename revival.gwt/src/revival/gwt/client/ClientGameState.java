package revival.gwt.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import revival.engine.tilebased.client.world.Location;
import revival.engine.tilebased.client.world.PositionData;
import revival.engine.tilebased.client.world.actiondata.ActionData;
import revival.engine.tilebased.client.world.actiondata.Alter;
import revival.engine.tilebased.client.world.actiondata.AlterationData;
import revival.engine.tilebased.client.world.actiondata.CheckData;
import revival.engine.tilebased.client.world.actiondata.Checkable;
import revival.engine.tilebased.client.world.actiondata.ImpassableData;
import revival.engine.tilebased.client.world.actiondata.MaskData;
import revival.engine.tilebased.client.world.actiondata.TransitionData;
import revival.gwt.client.service.GameStateServlet;
import revival.gwt.client.service.GameStateServletAsync;
import revival.gwt.client.service.ItemServlet;
import revival.gwt.client.service.ItemServletAsync;
import revival.gwt.client.service.MapServlet;
import revival.gwt.client.service.MapServletAsync;
import revival.gwt.client.service.SavegameServlet;
import revival.gwt.client.service.SavegameServletAsync;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.widget.option.OptionWidget;
import revival.gwt.client.ui.widget.option.TransitionWidget;
import revival.rules.IGameState;
import revival.rules.Savegame;
import revival.rules.player.Chara;
import revival.rules.player.Item;
import revival.rules.player.ItemFactory;
import revival.rules.player.Party;
import revival.rules.player.Usable;

import com.allen_sauer.gwt.log.client.Log;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class ClientGameState implements IGameState {

	private static ClientGameState _instance;

	public static ClientGameState getInstance() {
		if (_instance == null) {
			_instance = new ClientGameState();
		}
		return _instance;
	}

	private List<Party> parties = new ArrayList<Party>();
	private int curPartyIdx = 0;
	private Party currentParty = null;
	private Map<Integer, Integer> locationMapping; // key=targetMap, value=filename

	private IGuiStateListener guiStateListener;
	private Location currentLocation;
	
	private List<PositionData> positionData;

	private MapServletAsync mapService = GWT.create(MapServlet.class);
	private GameStateServletAsync gsService = GWT.create(GameStateServlet.class);

	public ClientGameState() {
		currentParty = new Party();
		parties.add(currentParty);
	}

	public void initGame() {

		loadItems();
		
	}
	
	private void loadItems() {
		Log.debug("loadItems");
		
		ItemServletAsync isa = GWT.create(ItemServlet.class);
		isa.loadItems(new AsyncCallback<List<Item>>() {
			@Override
			public void onSuccess(List<Item> result) {
				ItemFactory.init(result);
				
				loadSavegame();
			}
			@Override
			public void onFailure(Throwable caught) {
				Log.error(caught.getMessage(), caught);
			}
		});
	}
	
	private void loadSavegame() {
		Log.debug("loadSavegame");
		
		SavegameServletAsync savegame = GWT.create(SavegameServlet.class);
		savegame.loadSavegame(new AsyncCallback<Savegame>() {
			@Override
			public void onSuccess(Savegame result) {
				parties = result.getParties();
				currentParty = parties.get(result.getCurParty());

				// currentParty.setMapNr(43);
//				currentParty.setPosition(45, 29);

				guiStateListener.updateRoster();

				start();
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}
	
	public boolean getOtherParty(int rowPos, int colPos) {
		if (positionData == null) return false;
		for (PositionData pd : positionData) {
			if (pd.getPosX() == colPos && pd.getPosY() == rowPos) {
				return true;
			}
		}
		
		return false;
	}
	
	public void start() {
		locationMapping = new HashMap<Integer, Integer>();
		locationMapping.put(0, 100);
		locationMapping.put(1, 101);
		locationMapping.put(2, 102);
		locationMapping.put(3, 103);
		locationMapping.put(4, 104);
		locationMapping.put(5, 105);
		locationMapping.put(6, 106);
		locationMapping.put(7, 200);
		locationMapping.put(8, 107);
		locationMapping.put(9, 108);
		locationMapping.put(10, 109);
		locationMapping.put(11, 201);
		locationMapping.put(12, 202);
		locationMapping.put(13, 203);
		// locationMapping.put(14, 109);
		locationMapping.put(15, 204);
		locationMapping.put(16, 205);
		locationMapping.put(17, 206);
		locationMapping.put(18, 207);
		locationMapping.put(19, 208);
		locationMapping.put(20, 209);
		locationMapping.put(21, 210);
		locationMapping.put(22, 211);
		locationMapping.put(23, 212);
		locationMapping.put(24, 213);
		locationMapping.put(25, 214);
		locationMapping.put(26, 110);
		locationMapping.put(27, 111);
		locationMapping.put(28, 112);
		locationMapping.put(29, 113);
		locationMapping.put(31, 114);
		locationMapping.put(32, 115);
		locationMapping.put(33, 116);
		locationMapping.put(34, 117);
		locationMapping.put(35, 215);
		locationMapping.put(36, 216);
		locationMapping.put(38, 217);
		locationMapping.put(39, 218);
		locationMapping.put(40, 219);
		locationMapping.put(41, 220);
		locationMapping.put(42, 221);
		locationMapping.put(43, 118);
		locationMapping.put(49, 119);

		setPosition(currentParty.getPosRow(), currentParty.getPosCol());
		// setPosition(45, 29);
		loadLocation(currentParty.getMapNr(), currentParty.getPosCol(),
				currentParty.getPosRow(), false, true);
		// loadLocation(0, 29, 45, false, true); //genau unter quartz
		// loadLocation(43, 23, 30, false, true); //mine shaft
	}

	public void loadLocation(final Integer locationNr, Integer startX,
			Integer startY, boolean relative, final boolean initial) {
		Integer targetMap;
		if (locationNr != null) {
			if (locationMapping.containsKey(locationNr)) {
				targetMap = locationMapping.get(locationNr);
			} else {
				if (locationNr >= 128 && locationNr <= 191) { // quartz derelict
																// buildings
					targetMap = 105;
				} else if (locationNr >= 192 && locationNr <= 252) { // las
																		// vegas
																		// derelict
																		// buildings
					targetMap = 201;
				} else {
					Log.debug("Locationmapping not found: " + locationNr);
					leaveBuilding(); // just to hide all windows and return
										// keyhandler to previous
					return;
				}
			}
		} else {
			targetMap = currentParty.getPrevMapNr();
			currentParty.revertPosition();
			startX = currentParty.getPosCol();
			startY = currentParty.getPosRow();
		}

		final int targetX;
		final int targetY;

		if (relative) {
			if (startX != null) {
				targetX = getColPos() + startX;
			} else {
				targetX = currentParty.getPosCol();
			}

			if (startY != null) {
				targetY = getRowPos() + startY;
			} else {
				targetY = currentParty.getPosRow();
			}
		} else {
			targetX = startX;
			targetY = startY;
		}

		// if transition inside location, do not load location
		if (!initial) {
			if (targetMap == currentLocation.getMapNr()) {
				setPosition(targetY, targetX);

				if (guiStateListener.isOptionDisplayed()) {
					guiStateListener.closeOption();
				}

				guiStateListener.drawMap();
				evalPost(targetY, targetX);
				return;
			}
		}

		final int newMapNr = targetMap;

		mapService.loadLocation("map" + targetMap + ".xml",
				new AsyncCallback<Location>() {
					@Override
					public void onSuccess(Location result) {
						result.setId(locationNr);
						result.setMapNr(newMapNr);

						setCurrentLocation(result);
						setPosition(targetY, targetX);

						if (guiStateListener.isOptionDisplayed()) {
							guiStateListener.closeOption();
						} else {
							guiStateListener.setKeyHandler(guiStateListener
									.getMapComponent().getKeyHandler());
						}

						guiStateListener.drawMap();
						evalPost(targetY, targetX);
					}

					@Override
					public void onFailure(Throwable caught) {
						caught.printStackTrace();
					}
				});
	}

	public Party getCurrentParty() {
		return currentParty;
	}

	public void addMember(Chara newMember) {
		getCurrentParty().addMember(newMember);
		guiStateListener.updateRoster();
	}

	public void enterBuilding(OptionWidget widget) {
		if (!guiStateListener.isPictureDisplayed())
			guiStateListener.displayPicture("true");
		guiStateListener.displayOption(widget);
		if (!guiStateListener.isRosterDisplayed())
			guiStateListener.displayRoster(true);
	}

	public void leaveBuilding() {

		guiStateListener.hidePicture();
		guiStateListener.closeOption();
		guiStateListener.displayRoster(false);

		guiStateListener.setKeyHandlerToPrevious();
	}

	public void viewNextParty() {
		if (parties.size() == 1)
			return;

		int oldLocationNr = currentParty.getMapNr();

		if (curPartyIdx + 1 < parties.size()) {
			curPartyIdx++;
		} else {
			curPartyIdx = 0;
		}
		currentParty = parties.get(curPartyIdx);

		int newLocationNr = currentParty.getMapNr();
		int posRow = currentParty.getPosRow();
		int posCol = currentParty.getPosCol();
		if (oldLocationNr == newLocationNr) {
			guiStateListener.drawMap();
		} else {
			loadLocation(newLocationNr, posCol, posRow, false, false);
		}

		guiStateListener.getRosterComponent().update();
	}

	public IGuiStateListener getGuiStateListener() {
		return guiStateListener;
	}

	private void setCurrentLocation(Location curLoc) {
		currentLocation = curLoc;
		currentParty.setMapNr(currentLocation.getMapNr());
	}

	public Location getCurrentLocation() {
		return currentLocation;
	}

	public void setPosition(int rowPos, int colPos) {
		currentParty.setPosition(rowPos, colPos);
	}

	public void setRowPos(int rowPos) {
		currentParty.setPosRow(rowPos);
	}

	public void setColPos(int colPos) {
		currentParty.setPosCol(colPos);
	}

	public int getRowPos() {
		return currentParty.getPosRow();
	}

	public int getColPos() {
		return currentParty.getPosCol();
	}

	public void moveUp() {
		guiStateListener.displayRoster(false);
		int newRowPos = getRowPos() -1;
		int newColPos = getColPos();
		if (getRowPos() > 0 && evalPre(newRowPos, newColPos)) {
			gsService.move(currentParty.getMapNr(), newColPos, newRowPos, new AsyncCallback<List<PositionData>>() {
				@Override
				public void onSuccess(List<PositionData> result) {
					positionData = result;
					currentParty.decPosRow();

					guiStateListener.drawMap();
					evalPost(getRowPos(), getColPos());
				}
				@Override
				public void onFailure(Throwable caught) {
					Window.alert(caught.getMessage());
				}
			});
		}
	}

	public void moveDown() {
		guiStateListener.displayRoster(false);
		int newRowPos = getRowPos() +1;
		int newColPos = getColPos();
		if (getRowPos() < currentLocation.getTileData().getRows() -1 && evalPre(newRowPos, newColPos)) {
			gsService.move(currentParty.getMapNr(), newColPos, newRowPos, new AsyncCallback<List<PositionData>>() {
				@Override
				public void onSuccess(List<PositionData> result) {
					currentParty.incPosRow();

					guiStateListener.drawMap();
					evalPost(getRowPos(), getColPos());
				}
				@Override
				public void onFailure(Throwable caught) {
					Window.alert(caught.getMessage());
				}
			});
		}
	}

	public void moveLeft() {
		guiStateListener.displayRoster(false);
		int newRowPos = getRowPos();
		int newColPos = getColPos() -1;
		if (getColPos() > 0 && evalPre(newRowPos, newColPos)) {
			gsService.move(currentParty.getMapNr(), newColPos, newRowPos, new AsyncCallback<List<PositionData>>() {
				@Override
				public void onSuccess(List<PositionData> result) {
					currentParty.decPosCol();

					guiStateListener.drawMap();
					evalPost(getRowPos(), getColPos());					
				}
				@Override
				public void onFailure(Throwable caught) {
					Window.alert(caught.getMessage());
				}
			});

		}
	}

	public void moveRight() {
		guiStateListener.displayRoster(false);
		int newRowPos = getRowPos();
		int newColPos = getColPos() +1;
		if (getColPos() < currentLocation.getTileData().getCols() -1 && evalPre(newRowPos, newColPos)) {
			gsService.move(currentParty.getMapNr(), newColPos, newRowPos, new AsyncCallback<List<PositionData>>() {
				@Override
				public void onSuccess(List<PositionData> result) {
					currentParty.incPosCol();

					guiStateListener.drawMap();
					evalPost(getRowPos(), getColPos());
				}
				@Override
				public void onFailure(Throwable caught) {
					Window.alert(caught.getMessage());
				}
			});
		}
	}
	
	private boolean evalPre(int rowPos, int colPos) {
		ActionData actionData = currentLocation.getActionDataPos(rowPos, colPos);
		if (actionData == null) return true;
//		int actionNr = currentLocation.getAction(rowPos, colPos);
		
		if (actionData instanceof CheckData) { //2
			CheckData data = (CheckData)actionData;
			
			printMessage(data.getStartMessage());
			
			if (data.isPassable()) {
				return true; //check is executed in evalPost in this case
			} else {
				if (data.isAutoCheck()) { //executed automatically
					
					if (data.isParty()) { //whole party must pass
						int charNr = 0;
						for (Chara ch : currentParty.getMembers()) {
							for (Checkable check : data.getChecks()) {
								Usable usable = Checks.getForCheckable(ch, check);
								Checks.doCheck(charNr++, usable, data);
							}
						}
						
					} else {
						Chara ch = currentParty.getMember(0);
						for (Checkable check : data.getChecks()) {
							Usable usable = Checks.getForCheckable(ch, check);
							Checks.doCheck(0, usable, data);
						}
					}
					
				} else { //must Use
					return false;
				}
			}
		} else if (actionData instanceof MaskData) { //4
			MaskData data = (MaskData)actionData;
			
			printMessage(data.getMessage());
			return !data.isImpassable();
		} else if (actionData instanceof TransitionData) { //10
			TransitionData a = (TransitionData)actionData;
			if (a == null) return true;

			doTransition(a);
			
			return false;
		} else if (actionData instanceof ImpassableData) { //11
			ImpassableData data = (ImpassableData)actionData;
			printMessage(data.getMessageNr());
			return false;
		}
		
		return true;
	}		

	private void evalPost(int rowPos, int colPos) {
		ActionData actionData = currentLocation.getActionDataPos(rowPos, colPos);
		
		if (actionData == null) return;
		
//		Log.debug("evalPost " + colPos + "/" + rowPos);
//		Log.debug("actionClass=" + actionData.getClass());
		
		Checks.eval(actionData);
	}
	
	public void printMessage(Integer messageNr) {
		if (messageNr == null)
			return;

		String msg = currentLocation.getString(messageNr);
		guiStateListener.printMessage(msg);
	}

	public void doAlteration(AlterationData data) {
		Log.debug("alteration " + data.getId() + ", size=" + data.getAlterations().size());
		ActionData newData;
		for (Alter ad : data.getAlterations()) {
			newData = currentLocation.getActionDataId(ad.getNewActionClass(), ad.getNewAction());
			
			if (ad.getUnknown() != null) {
				Log.warn("Unknown alter data");
			}
			
			try {
				currentLocation.alterActionData(ad.getY(), ad.getX(), newData);
			} catch (NullPointerException e) {
				Log.warn("Not executing alteraction because of nullpointer. Cancelling alteration action");
				return;
			}
		}

		Integer nac = data.getNewActionClass();
		
		if (nac != null) {
			Integer na = data.getNewAction();
			try {
				ActionData ad = currentLocation.getActionDataId(nac, na);
				Checks.eval(ad);
			} catch(NullPointerException e) {
				
			}
		}
	}

	public void doTransition(TransitionData data) {
		if (data.isConfirm()) {
			guiStateListener.printMessage(currentLocation.getString(data
					.getMessageNr()));
			guiStateListener.displayOption(new TransitionWidget(data));
		} else {
			loadLocation(data.getTargetMap(), data.getTargetX(), data
					.getTargetY(), data.isRelative(), false);
		}

		Integer nac = data.getNewActionClass();
		if (nac != null) {
			Integer na = data.getNewAction();
			try {
				ActionData ad = currentLocation.getActionDataId(nac, na);
				Checks.eval(ad);
			} catch (NullPointerException e) {
				
			}
		}
	}

	@Override
	public List<Party> getParties() {
		return parties;
	}

	public void setGuiStateListener(IGuiStateListener guiStateListener) {
		this.guiStateListener = guiStateListener;
	}
}
