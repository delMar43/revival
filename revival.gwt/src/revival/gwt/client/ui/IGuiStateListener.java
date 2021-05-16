package revival.gwt.client.ui;

import revival.gwt.client.ui.keyhandler.AbstractKeyDownHandler;
import revival.gwt.client.ui.widget.RosterWidget;
import revival.gwt.client.ui.widget.option.OptionWidget;

public interface IGuiStateListener {

	public void displayPicture(String text);
	
	public void hidePicture();
	
	public boolean isPictureDisplayed();
	
	public void displayRoster(boolean display);
	
	public boolean isRosterDisplayed();
	
	public void displayOption(OptionWidget optionWidget);
	
	public boolean isOptionDisplayed();
	
	public void closeOption();
	
	public void hideOption();
	
	public void showOption();
	
	public OptionWidget getOptionWidget();
	
	public void drawMap();
	
	public void printMessage(String text);
	
	public IMapComponent getMapComponent();
	
	public void setKeyHandler(AbstractKeyDownHandler handler);
	
	public void setKeyHandlerToPrevious();
	
	public void updateRoster();
	
	public RosterWidget getRosterComponent();
	
	public void closeAllOptions();
}
