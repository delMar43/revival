package revival.gwt.client.ui.widget;

import revival.gwt.client.ClientGameState;
import revival.rules.player.Chara;
import revival.rules.player.Item;
import revival.rules.player.Party;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class RosterWidget extends AbstractWidget {

	private AbsolutePanel panel;
	private Image border;
	private Grid grid;
	private ClientGameState gameState = ClientGameState.getInstance();
	
	public RosterWidget() {
		panel = new AbsolutePanel();
		border = images.borderRoster().createImage();
		panel.setWidth(border.getWidth() + "px");
		panel.setHeight(border.getHeight() + "px");
		
		panel.add(border);
		
		grid = new Grid(7, 7);
		grid.setWidth("100%");
		panel.add(grid, 16, 50);
		
		initWidget(panel);
	}
	
	public void setActiveChara(int index) {
		Party p = gameState.getCurrentParty();
		int ctr=1;
		for (Chara c : p.getMembers()) {
			if (ctr == index) {
				grid.getWidget(ctr-1, 0).getElement().getStyle().setProperty("backgroundColor", "white");
				grid.getWidget(ctr-1, 0).getElement().getStyle().setProperty("color", "black");
			} else {
				grid.getWidget(ctr-1, 0).getElement().getStyle().setProperty("backgroundColor", "black");
				grid.getWidget(ctr-1, 0).getElement().getStyle().setProperty("color", "white");
			}
			ctr++;
		}
	}
	
	public void update() {
		Party p = gameState.getCurrentParty();
		int ctr=1;
		for (Chara c : p.getMembers()) {
			grid.setWidget(ctr-1, 0, new Label(ctr + ">"));
			grid.setWidget(ctr-1, 1, new Label(c.getName()));
			grid.setWidget(ctr-1, 2, new Label("0"));
			grid.setWidget(ctr-1, 3, new Label("0"));
			grid.setWidget(ctr-1, 4, new Label(c.getMaxCon()+""));
			grid.setWidget(ctr-1, 5, new Label(c.getCurCon()+""));
			Item weapon = c.getWeapon();
			grid.setWidget(ctr-1, 6, new Label(weapon != null ? weapon.getName() : "Fists"));
			
			ctr++;
		}
	}
}
