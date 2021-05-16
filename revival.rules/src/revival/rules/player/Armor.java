package revival.rules.player;

public class Armor extends Item {

	public Armor() {}
	
	public Armor(int id, String name, String plural, int lowCost, int highCost, int nrUses, int itemType, int shopItemNr, int armorClass) {
		super(id, name, plural, lowCost, highCost, nrUses, itemType, shopItemNr, armorClass);
	}
	
	public Armor(Armor pattern) {
		super(pattern);
	}
}
