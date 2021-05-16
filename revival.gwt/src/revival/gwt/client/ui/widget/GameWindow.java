package revival.gwt.client.ui.widget;

import java.util.Stack;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.IGuiStateListener;
import revival.gwt.client.ui.keyhandler.AbstractKeyDownHandler;
import revival.gwt.client.ui.widget.option.OptionWidget;

import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;

/**
 * the first widget.
 * displays the time and contains all the other widgets.
 * @author martin
 *
 */
public class GameWindow extends Composite implements IGuiStateListener {

	private FocusPanel root;
	private AbsolutePanel panel;
	private HandlerRegistration handlerReg;
	private KeyDownHandler currentHandler;

	private Stack<OptionWidget> optionWidgets = new Stack<OptionWidget>();
	
	private MapWidget mapWidget = new MapWidget();
	private TimeWidget timeWidget = new TimeWidget();
	private PicWidget pictureWidget = new PicWidget();
	private GeigerWidget geigerWidget = new GeigerWidget();
	private RosterWidget rosterWidget = new RosterWidget();
	private MessageWidget messageWidget = new MessageWidget();
	
	private boolean optionDisplayed = false;
	private boolean pictureDisplayed = false;
	private boolean rosterDisplayed = false;
	
	public GameWindow() {
		root = new FocusPanel();
		panel = new AbsolutePanel();
		panel.setWidth("640px");
		panel.setHeight("480px");
		
		root.add(panel);
		
		panel.add(mapWidget);
		panel.add(timeWidget, 540, 0);
		panel.add(geigerWidget, 608, 12);
		panel.add(messageWidget, 0, 300);
		panel.add(rosterWidget, 0, 224);
		
		panel.add(pictureWidget, 0, 0);

		pictureWidget.setVisible(false);
		rosterWidget.setVisible(false);
		
		initWidget(root);
		
		root.setFocus(true);
	}
	
	public void drawMap() {
		ClientGameState gs = ClientGameState.getInstance();
		mapWidget.drawMap(gs.getColPos(), gs.getRowPos());
	}
	
	@Override
	public void printMessage(String text) {
		messageWidget.printMessage(text);
	}
	
	@Override
	public void displayPicture(String text) {
		pictureWidget.setVisible(true);
		pictureDisplayed = true;
	}
	
	@Override
	public void hidePicture() {
		pictureWidget.setVisible(false);
		pictureDisplayed = false;
	}
	
	@Override
	public boolean isPictureDisplayed() {
		return pictureDisplayed;
	}
	
	@Override
	public void displayOption(OptionWidget optionWidget) {
		this.optionWidgets.push(optionWidget);
		panel.add(optionWidget, 208, 0);
		optionWidget.setVisible(true);
		setKeyHandler(optionWidget.getKeyHandler());
	}
	
	@Override
	public void closeOption() {
		OptionWidget ow = optionWidgets.pop();
		ow.setVisible(false);
		panel.remove(ow);
		ow = null;
		setKeyHandlerToPrevious();
		
		if (!optionWidgets.isEmpty()) {
			optionWidgets.peek().getFocus();
		}
	}
	
	public void closeAllOptions() {
		int nrWidgets = optionWidgets.size();
		for (int idx = 0; idx < nrWidgets; idx++) {
			OptionWidget ow = optionWidgets.peek();
			if (!ow.ignoreHideAll()) {
				closeOption();
			} else {
				break;
			}
		}
	}
	
	@Override
	public void hideOption() {
		int nrWidgets = optionWidgets.size();
		for (int idx = 0; idx < nrWidgets; idx++) {
			OptionWidget ow = optionWidgets.get(idx);
			ow.setVisible(false);
		}
	}
	
	@Override
	public void showOption() {
		int nrWidgets = optionWidgets.size();
		for (int idx = 0; idx < nrWidgets; idx++) {
			OptionWidget ow = optionWidgets.get(idx);
			ow.setVisible(true);
		}
	}
	
	@Override
	public boolean isOptionDisplayed() {
		return !optionWidgets.isEmpty();
	}
	
	@Override
	public OptionWidget getOptionWidget() {
		return optionWidgets.peek();
	}
	
	@Override
	public void displayRoster(boolean display) {
		if (!display) {
			rosterWidget.setActiveChara(-1);
		}
		rosterDisplayed = display;
		rosterWidget.setVisible(display);
	}
	
	@Override
	public boolean isRosterDisplayed() {
		return rosterDisplayed;
	}
	
	public void updateRoster() {
		rosterWidget.update();
	}
	
	public RosterWidget getRosterComponent() {
		return rosterWidget;
	}
	
	public MapWidget getMapComponent() {
		return mapWidget;
	}
	
	public void setKeyHandler(AbstractKeyDownHandler handler) {
		currentHandler = handler;
		
		if (handlerReg != null) {
			handlerReg.removeHandler();
		}
		handlerReg = root.addKeyDownHandler(currentHandler);
	}
	
	public void setKeyHandlerToPrevious() {
		if (!optionWidgets.isEmpty()) {
			currentHandler = optionWidgets.peek().getKeyHandler();
		} else {
			currentHandler = mapWidget.getKeyHandler();
		}
		if (handlerReg != null) {
			handlerReg.removeHandler();
		}
		
		handlerReg = root.addKeyDownHandler(currentHandler);
	}
}
