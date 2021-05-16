package revival.gwt.client.ui.widget.option;

import revival.rules.player.Chara;
import revival.rules.player.Item;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

public abstract class AbstractInventoryWidget extends GridTextWidget {

	private static final int PAGESIZE = 9;
	
	private Chara chara;
	private int pageNr;
	private int pages;
	
	public AbstractInventoryWidget(Chara chara) {
		this.chara = chara;
		
		createScreen(2);

		grid.getCellFormatter().setAlignment(0, 1, HasHorizontalAlignment.ALIGN_LEFT, HasVerticalAlignment.ALIGN_MIDDLE);
		
		showData();
	}
	
	public void pageDown() {
		if (pageNr < pages -1) {
			pageNr++;
			showData();
		}
	}
	
	public void pageUp() {
		if (pageNr > 0) {
			pageNr--;
			showData();
		}
	}
	
	public int getItemOffset() {
		return pageNr * PAGESIZE;
	}
	
	public void selectItem(int index) {
		final Element row = grid.getRowFormatter().getElement(index +1);
		
		row.getStyle().setProperty("backgroundColor", "white");
		row.getStyle().setProperty("color", "black");
	}
	
	private void unselectItem(int index) {
		final Element row = grid.getRowFormatter().getElement(index +1);
		
		row.getStyle().setProperty("backgroundColor", "black");
		row.getStyle().setProperty("color", "white");
	}
	
	public void update() {
		showData();
	}
	
	private void showData() {
		grid.clear();
		
		write("ITEM", 1, 2);
	
		int nrItems = chara.getInventory().size();
		
		if (nrItems > PAGESIZE) {
			pages = nrItems / PAGESIZE +1;
		} else {
			pages = 1;
		}
		
		int start = pageNr * PAGESIZE;
		int end = start + PAGESIZE;
		
		int line=2;
		for (int idx=start; idx < end; idx++) {
			if (idx >= nrItems) break;
			
			Item item = chara.getItem(idx);
			if (item == null) break;
			
			write(line-1 + ")", line, 1);
			write(item.getName(), line, 2);
			
			if (chara.getWeapon() == item || chara.getArmor() == item) {
				selectItem(line -2);
			} else {
				unselectItem(line -2);
			}
			
			line++;
		}
	}
}
