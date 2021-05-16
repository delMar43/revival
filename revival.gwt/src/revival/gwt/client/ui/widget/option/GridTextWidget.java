package revival.gwt.client.ui.widget.option;

import java.util.List;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;

public abstract class GridTextWidget extends OptionWidget {

	protected Grid grid;
	
	public GridTextWidget() {
		grid = new Grid();
		grid.setStyleName("white");
		grid.setWidth("400px");
		grid.setHeight("190px");
		grid.addStyleName("staticTextTable");
		createScreen(1);
	}
	
	protected void createScreen(int columns) {
		grid.clear();
		panel.add(grid, 16, 12);		
		grid.resize(11, columns);
	}
	
	protected void write(String text, int row) {
		write(text, row, 1);
	}
	
	protected void write(String text, int row, int col) {
		grid.setWidget(row-1, col-1, new HTML(text));
	}
	
	protected void write(List<String> text) {
		int idx=0;
		for (String t : text) {
			grid.setWidget(idx++, 0, new Label(t));
		}
	}
}
