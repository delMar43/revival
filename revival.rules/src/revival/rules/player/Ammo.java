package revival.rules.player;

public class Ammo extends Item {

	public Ammo() {}
	
	public Ammo(int id, String name, String plural, int lowCost, int highCost, int nrUses, int itemType, int shopItemNr) {
		super(id, name, plural, lowCost, highCost, nrUses, itemType, shopItemNr, 1);
	}
	
	public Ammo(Ammo pattern) {
		super(pattern);
	}
}
