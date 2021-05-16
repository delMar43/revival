package revival.gwt.client.ui.widget.option;

import com.google.gwt.user.client.ui.FlexTable;

public class FlexTextWidget extends OptionWidget {

	protected FlexTable table;
	
	protected void initTable() {
		table = new FlexTable();
		panel.add(table, 16, 12);
	}
	
	protected void clearTable() {
		table.removeFromParent();
		initTable();
	}
	
	protected void addCells(int row, int nrCells) {
		for (int i=0; i<nrCells; i++) {
			table.addCell(row);
		}
	}
}
