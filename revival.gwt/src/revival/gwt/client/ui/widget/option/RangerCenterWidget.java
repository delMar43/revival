package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.TextLocator;
import revival.gwt.client.ui.Texts;
import revival.gwt.client.ui.keyhandler.RangerCenterKeyHandler;
import revival.rules.special.RangerCenter;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

public class RangerCenterWidget extends GridTextWidget {

	private Texts texts = TextLocator.getTexts();
	private FlexTable table;
	private Label[] attLabels;
	private Label maxConLabel;
	private Label lblName;
	
	private RangerCenter rc = new RangerCenter(ClientGameState.getInstance());
	
	public RangerCenterWidget() {
		keyHandler = new RangerCenterKeyHandler(rc, this);
		ignoreHideAll = true;
		
		showWelcome();
	}
	
	@Override
	public void getFocus() {
		ClientGameState.getInstance().getGuiStateListener().displayRoster(true);
		showWelcome();
	}
	
	private void initTable() {
		if (grid != null && grid.isAttached()) {
			grid.removeFromParent();
		}
		table = new FlexTable();
		panel.add(table, 16, 12);
	}
	
	private void removeTable() {
		if (table != null && table.isAttached()) {
			table.removeFromParent();
		}
	}
	
	private void addCells(int row, int nrCells) {
		for (int i=0; i<nrCells; i++) {
			table.addCell(row);
		}
	}
	
	public void showWelcome() {
		removeTable();
		createScreen(1);
		
		write("Welcome to the Ranger Center", 1);
		if (rc.canCreateCharacter()) write("Create Character", 3);
		if (rc.canDeleteCharacter()) write("Delete Character", 4);
		if (rc.canLeaveBuilding()) write("Leave Ranger Center", 5);
		
		rc.welcome();
	}
	
	public void showCreateCharacter() {
		initTable();
		
		attLabels = new Label[8];
		maxConLabel = new Label();
		for (int i=0; i<attLabels.length; i++) {
			attLabels[i] = new Label();
		}
		
		for (int i=0; i<11; i++) {
			table.insertRow(i);
		}
		
		table.addCell(0);
		table.getFlexCellFormatter().setColSpan(0, 0, 6);
		table.setWidget(0, 0, new Label("Create a character."));
		
		table.addCell(1);
		table.setWidget(1, 0, new HTML("&nbsp"));
		
		addCells(2, 6);
		table.setWidget(2, 0, new Label(texts.st()));
		table.setWidget(2, 1, attLabels[0]);
		table.setWidget(2, 2, new Label(texts.iq()));
		table.setWidget(2, 3, attLabels[1]);
		table.setWidget(2, 4, new Label(texts.lk()));
		table.setWidget(2, 5, attLabels[2]);
		
		addCells(3, 6);
		table.setWidget(3, 0, new Label(texts.sp()));
		table.setWidget(3, 1, attLabels[3]);
		table.setWidget(3, 2, new Label(texts.agl()));
		table.setWidget(3, 3, attLabels[4]);
		table.setWidget(3, 4, new Label(texts.dex()));
		table.setWidget(3, 5, attLabels[5]);
		
		addCells(4, 6);
		table.setWidget(4, 0, new Label(texts.chr()));
		table.setWidget(4, 1, attLabels[6]);
		table.setWidget(4, 2, new Label(texts.skp()));
		table.setWidget(4, 3, attLabels[7]);
		
		addCells(5, 1);
		table.getFlexCellFormatter().setColSpan(5, 0, 6);
		table.setWidget(5, 0, new Label("Rank: Private"));
		
		addCells(6, 1);
		table.getFlexCellFormatter().setColSpan(6, 0, 6);
		table.setWidget(6, 0, maxConLabel);
		
		addCells(7, 1);
		table.getFlexCellFormatter().setColSpan(7, 0, 6);
		table.setWidget(7, 0, new Label("$=0"));
		
		addCells(8, 1);
		table.getFlexCellFormatter().setColSpan(8, 0, 6);
		table.setWidget(8, 0, new Label("(SPACE) to roll again."));
		
		addCells(9, 1);
		table.getFlexCellFormatter().setColSpan(9, 0, 6);
		table.setWidget(9, 0, new Label("(ENTER) to accept."));
		
		rc.createCharacter();
		
		//show initial roll data
		int[] atts = rc.rollAttDice();
		showAttributeValues(atts);
		showMaxConValue(rc.rollMaxConDice());
	}
	
	public void showAttributeValues(int[] values) {
		for (int i=0;i<7;i++) {
			attLabels[i].setText(values[i] + "");
		}
		attLabels[7].setText(values[1]+"");
	}
	
	public void showMaxConValue(int value) {
		maxConLabel.setText("MAXCON=" + value);
	}
	
	public void showEnterName() {
		removeTable();
		createScreen(1);
		
		lblName = new Label();
		
		write("Enter name", 1);
		grid.setWidget(2, 0, lblName);
		
		rc.enterName();
	}
	
	public void addLetter(int code) {
		String text = lblName.getText();

		char c = (char)code;
		String letter = String.valueOf(c);
		if (text.length() <= 13) {
			text += letter;
			
		}
		
		lblName.setText(text);
		rc.setName(text);
	}
	
	public void removeLetter() {
		String text = lblName.getText();
		if (text.length() > 0) {
			text = text.substring(0, text.length()-1);
		}
		lblName.setText(text);
		rc.setName(text);
	}
	
	public void showEnterSex() {
		removeTable();
		createScreen(1);
		
		write("Enter sex:", 1);
		write("Male", 3);
		write("Female", 4);
		
		rc.enterSex();
	}
	
	public void showEnterNationality() {
		removeTable();
		createScreen(1);
		
		write("Nationality", 1);
		write("1) U.S.", 3);
		write("2) Russian", 4);
		write("3) Mexican", 5);
		write("4) Indian", 6);
		write("5) Chinese", 7);
		
		rc.enterNationality();
	}
	
	//seems to enter some kind of library mode here
	public void showEnterSkillpoints() {
		removeTable();
		createScreen(1);
		
		write("SKILLPOINTS=" + rc.getSkillpoints(), 1);
		
		rc.enterSkillpoints();
	}
}
