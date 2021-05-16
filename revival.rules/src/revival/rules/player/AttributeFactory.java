package revival.rules.player;


public class AttributeFactory {
	
	public static final String ATT_STRENGTH = "STR";
	public static final String ATT_IQ = "IQ";
	public static final String ATT_LUCK = "LUCK";
	public static final String ATT_SPEED = "SPEED";
	public static final String ATT_AGILITY = "AGILITY";
	public static final String ATT_DEXTERITY = "DEXTERITY";
	public static final String ATT_CHARISMA = "CHARISMA";

	public static Attribute createStrength(int level) {
		return new Attribute(1, ATT_STRENGTH, level, 14);
	}
	
	public static Attribute createIq(int level) {
		return new Attribute(2, ATT_IQ, level, 15);
	}
	
	public static Attribute createLuck(int level) {
		return new Attribute(3, ATT_LUCK, level, 16);
	}
	
	public static Attribute createSpeed(int level) {
		return new Attribute(4, ATT_SPEED, level, 17);
	}
	
	public static Attribute createAgility(int level) {
		return new Attribute(5, ATT_AGILITY, level, 18);
	}
	
	public static Attribute createDexterity(int level) {
		return new Attribute(6, ATT_DEXTERITY, level, 19);
	}
	
	public static Attribute createCharisma(int level) {
		return new Attribute(7, ATT_CHARISMA, level, 20);
	}
}
