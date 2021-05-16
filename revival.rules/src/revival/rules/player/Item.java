package revival.rules.player;


public class Item implements Usable {

	protected int id;
	protected String uid; //has to be created upon creation of item. provides possibility to uniquely identify each item (like a serialnr)
	protected String name;
	protected String plural;
	protected int lowCost;
	protected int highCost;
	protected int nrUses;
	protected int itemType;
	protected int baseDamage;
	protected int shopItemNr;

	public Item(){}
	
	public Item(int id, String name, String plural, int lowCost, int highCost, int nrUses, int itemType, int shopItemNr, int baseDamage) {
		this.id = id;
		this.name = name;
		this.plural = plural;
		this.lowCost = lowCost;
		this.highCost = highCost;
		this.nrUses = nrUses;
		this.itemType = itemType;
		this.baseDamage = baseDamage;
		this.shopItemNr = shopItemNr;
	}
	
	public Item (Item pattern) {
		this.id = pattern.id;
		this.name = pattern.name;
		this.plural = pattern.plural;
		this.lowCost = pattern.lowCost;
		this.highCost = pattern.highCost;
		this.nrUses = pattern.nrUses;
		this.itemType = pattern.itemType;
		this.baseDamage = pattern.baseDamage;
		this.shopItemNr = pattern.shopItemNr;
	}
	
	public int getId() {
		return id;
	}

	public String getUid() {
		return uid;
	}

	public String getName() {
		return name;
	}

	public String getPlural() {
		return plural;
	}

	public int getLowCost() {
		return lowCost;
	}

	public int getHighCost() {
		return highCost;
	}
	
	public int getNrUses() {
		return nrUses;
	}

	public int getItemType() {
		return itemType;
	}
	
	public int getShopItemNr() {
		return shopItemNr;
	}	
	
//	unknown bytes
//	private byte b2;
//	private byte b4;
//	private byte b5;
//	private byte b6;
//	private byte b7;
	
}
