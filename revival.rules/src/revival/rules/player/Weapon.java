package revival.rules.player;

public class Weapon extends Item {

	/*
	 * 1=melee, 
	 * 2=short, 3=medium, 4=long) 
	 * 5=short, 6=medium, 7=long with burst/autofire enabled 
	 * 8=medium rocket, 9=long rocket
	 * 10=short energy
	 * 11=medium energy
	 * 12=long energy
	 * 13=explosives
	 */
	private boolean demo; //demolition (splash damage)
	private int ammoType;
	private int skillNr;
	private int curLoad;

	public Weapon() {}
	
	public Weapon(int id, String name, String plural, int lowCost, int highCost, int nrUses, int itemType, int shopItemNr, boolean demo, int ammoType, int skillNr, int baseDamage) {
		super(id, name, plural, lowCost, highCost, nrUses, itemType, shopItemNr, baseDamage);
		this.demo = demo;
		this.ammoType = ammoType;
		this.skillNr = skillNr;
	}
	
	public Weapon(Weapon pattern) {
		super(pattern);
		this.demo = pattern.demo;
		this.ammoType = pattern.ammoType;
		this.skillNr = pattern.skillNr;
	}
	
	public void setCurLoad(int curLoad) {
		this.curLoad = curLoad;
	}
	public int getCurLoad() {
		return curLoad;
	}
	
	public boolean isDemo() {
		return demo;
	}
	public int getAmmoType() {
		return ammoType;
	}
	public int getSkillNr() {
		return skillNr;
	}
	public int getBaseDamage() {
		return baseDamage;
	}
}
