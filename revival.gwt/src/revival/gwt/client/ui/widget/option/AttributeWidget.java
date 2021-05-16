package revival.gwt.client.ui.widget.option;

import revival.gwt.client.ClientGameState;
import revival.gwt.client.ui.TextLocator;
import revival.gwt.client.ui.Texts;
import revival.gwt.client.ui.keyhandler.AttributeScreenKeyHandler;
import revival.rules.player.Chara;
import revival.rules.player.Nationality;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Label;

public class AttributeWidget extends FlexTextWidget {

	private Texts texts = TextLocator.getTexts();
	private Chara chara;
	
	public AttributeWidget(int charNr) {
		chara = ClientGameState.getInstance().getCurrentParty().getMember(charNr);
		keyHandler = new AttributeScreenKeyHandler(this, chara);
		
		initTable();
		
		
		//create 10 lines
		for (int i=0; i<10; i++) {
			table.insertRow(i);
		}
		
		table.addCell(0);
		table.getFlexCellFormatter().setColSpan(0, 0, 6);
		
		addCells(2, 6);
		addCells(3, 6);
		addCells(4, 6);

		//align attribute values
		for (int j=2;j<=4;j++) {
			for (int i=1;i<=5;i+=2) {
				table.getFlexCellFormatter().setAlignment(j, i, HasHorizontalAlignment.ALIGN_RIGHT, HasVerticalAlignment.ALIGN_MIDDLE);
			}
		}
		
		addCells(5, 1);
		table.getFlexCellFormatter().setColSpan(5, 0, 6);
		
		addCells(6, 1);
		table.getFlexCellFormatter().setColSpan(6, 0, 6);
		
		addCells(7, 1);
		table.getFlexCellFormatter().setColSpan(7, 0, 6);
		
		addCells(8, 1);
		table.getFlexCellFormatter().setColSpan(8, 0, 6);
		
		addCells(9, 1);
		table.getFlexCellFormatter().setColSpan(9, 0, 6);
		
		fillTable();
	}
	
	private void fillTable() {
		table.setWidget(0, 0, new Label("NAME: " + chara.getName()));
		
		table.setWidget(2, 0, new Label(texts.st()));
		table.setWidget(2, 1, createLabel(chara.getStrength()));
		table.setWidget(2, 2, new Label(texts.iq()));
		table.setWidget(2, 3, createLabel(chara.getIq()));
		table.setWidget(2, 4, new Label(texts.lk()));
		table.setWidget(2, 5, createLabel(chara.getLuck()));
		
		table.setWidget(3, 0, new Label(texts.sp()));
		table.setWidget(3, 1, createLabel(chara.getSpeed()));
		table.setWidget(3, 2, new Label(texts.agl()));
		table.setWidget(3, 3, createLabel(chara.getAgility()));
		table.setWidget(3, 4, new Label(texts.dex()));
		table.setWidget(3, 5, createLabel(chara.getDexterity()));
		
		table.setWidget(4, 0, new Label(texts.chr()));
		table.setWidget(4, 1, createLabel(chara.getCharisma()));
		table.setWidget(4, 2, new Label(texts.skp()));
		table.setWidget(4, 3, createLabel(chara.getSkillPoints()));
		
		table.getFlexCellFormatter().setColSpan(5, 0, 6);
		table.setWidget(5, 0, new Label("RANK: " + chara.getRank()));
		
		table.getFlexCellFormatter().setColSpan(6, 0, 6);
		table.setWidget(6, 0, new Label("MAXCON: " + chara.getMaxCon()));
		
		table.getFlexCellFormatter().setColSpan(7, 0, 6);
		table.setWidget(7, 0, new Label("$=" + chara.getMoney()));
		
		table.getFlexCellFormatter().setColSpan(8, 0, 6);
		table.setWidget(8, 0, new Label("SEX: " + (chara.isFemale()?"FEMALE":"MALE")));
		
		table.getFlexCellFormatter().setColSpan(9, 0, 6);
		table.setWidget(9, 0, new Label("NATIONALITY: " + Nationality.getNationality(chara.getNationality())));
	}
	
	public void redraw() {
		fillTable();
	}
}
