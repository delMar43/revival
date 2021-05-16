package revival.rules.special;

import revival.rules.Dice;
import revival.rules.IGameState;
import revival.rules.player.Attribute;
import revival.rules.player.Chara;
import revival.rules.player.Party;

public class RangerCenter {
	
	public static final String SCREEN_WELCOME = "welcome";
	public static final String SCREEN_CREATE = "create";
	public static final String SCREEN_NAME = "name";
	public static final String SCREEN_SEX = "sex";
	public static final String SCREEN_NATIONALITY = "nationality";
	public static final String SCREEN_SKILLS = "skills";
	
	private IGameState gameState;
	private Chara curChara;
	private String curScreen;
	private int[] atts = new int[7];
	private int maxCon;
	
	private Dice dice;
	
	public RangerCenter(IGameState gameState) {
		this.gameState = gameState;
		dice = new Dice();
	}
	
	public boolean canCreateCharacter() {
		return getNrOfPlayerCharacters() < 4;
	}
	
	public boolean canDeleteCharacter() {
		return getNrOfPlayerCharacters() > 0;
	}
	
	public boolean canLeaveBuilding() {
		return getNrOfPlayerCharacters() > 0;
	}

	public void welcome() {
		curScreen = SCREEN_WELCOME;
	}
	
	public void createCharacter() {
		curScreen = SCREEN_CREATE;
		curChara = new Chara(true);
	}
	
	public void deleteCharacter(Chara pc) {
		curChara = pc;
	}
	
	public int[] rollAttDice() {
		int[] attValues = new int[7];
		for (int i=0;i<7;i++) {
			attValues[i] = dice.roll(3, 6, 0);
		}
		atts = attValues;
		return attValues;
	}
	
	public int rollMaxConDice() {
		maxCon = dice.roll(1, 14, 22);
		return maxCon;
	}
	
	public void acceptAttributes() {
		curChara.setStrength(atts[0]);
		curChara.setIq(atts[1]);
		curChara.setLuck(atts[2]);
		curChara.setSpeed(atts[3]);
		curChara.setAgility(atts[4]);
		curChara.setDexterity(atts[5]);
		curChara.setCharisma(atts[6]);
		curChara.setSkillPoints(curChara.getIq());
		
		curChara.setMaxCon(maxCon);
	}
	
	public void enterName() {
		curScreen = SCREEN_NAME;
	}
	
	public void setName(String name) {
		curChara.setName(name);
	}
	
	public void enterSex() {
		curScreen = SCREEN_SEX;
	}
	
	public void acceptSex(boolean female) {
		curChara.setFemale(female);
	}
	
	public void enterNationality() {
		curScreen = SCREEN_NATIONALITY;
	}
	
	public void acceptNationality(int nationality) {
		curChara.setNationality(nationality);
	}
	
	public void enterSkillpoints() {
		curScreen = SCREEN_SKILLS;
	}
	
	public void acceptSkillpoints() {
		System.out.println("character " + curChara.getName() + " created");
	}
	
	public String getCurrentScreen() {
		return curScreen;
	}
	
	private int getNrOfPlayerCharacters() {
		int result = 0;
		for (Party p : gameState.getParties()) {
			for (Chara c : p.getMembers()) {
				if (c.isPlayerCharacter()) result++;
			}
		}
		return result;
	}
	
	public int getSkillpoints() {
		return curChara.getSkillPoints();
	}
	
	public Chara getCurrentCharacter() {
		return curChara;
	}
}
