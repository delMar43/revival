package revival.gwt.client;

import revival.gwt.client.ui.widget.GameWindow;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Revival implements EntryPoint {

	public void onModuleLoad() {
		
		final GameWindow gw = new GameWindow();
		RootPanel.get().add(gw);
		ClientGameState.getInstance().setGuiStateListener(gw);
		ClientGameState.getInstance().initGame();
		
	}
	
}
