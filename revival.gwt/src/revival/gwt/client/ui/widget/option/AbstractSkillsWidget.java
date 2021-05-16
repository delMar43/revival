package revival.gwt.client.ui.widget.option;

import revival.rules.player.Chara;
import revival.rules.player.Skill;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

public abstract class AbstractSkillsWidget extends GridTextWidget {

	private static final int PAGESIZE = 9;
	
	private Chara chara;
	private int pageNr;
	private int pages;
	
	public AbstractSkillsWidget(Chara chara) {
		this.chara = chara;
		
		createScreen(3);

		grid.getCellFormatter().setAlignment(0, 2, HasHorizontalAlignment.ALIGN_CENTER, HasVerticalAlignment.ALIGN_MIDDLE);
		
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
	
	public int getSkillOffset() {
		return pageNr * PAGESIZE;
	}
	
	public void selectSkill(int index) {
		final Element row = grid.getRowFormatter().getElement(index +1);
		
		row.getStyle().setProperty("backgroundColor", "white");
		row.getStyle().setProperty("color", "black");
	}
	
	private void showData() {
		grid.clear();
		
		write(texts.lvl(), 1, 2);
		write(texts.skill(), 1, 3);
	
		int nrSkills = chara.getSkills().size();
		
		if (nrSkills > PAGESIZE) {
			pages = nrSkills / PAGESIZE +1;
		} else {
			pages = 1;
		}
		
		int start = pageNr * PAGESIZE;
		int end = start + PAGESIZE;
		
		int line=2;
		for (int idx=start; idx < end; idx++) {
			if (idx >= nrSkills) break;
			
			Skill skill = chara.getSkills().get(idx);
			if (skill == null) break;
			
			write(line-1 + ")", line, 1);
			write(skill.getLevel()+"", line, 2);
			write(skill.getName(), line, 3);
			
			line++;
		}
	}
}
