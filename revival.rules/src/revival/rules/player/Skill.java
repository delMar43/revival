package revival.rules.player;


public class Skill implements Usable {

	private int id;
	private String name;
	private int level;
	private boolean special;
	
	private int attId;
	
	public Skill() {}
	
	public Skill(Skill pattern, int level) {
		this.id = pattern.id;
		this.name = pattern.name;
		this.level = level;
		this.special = pattern.special;
		this.attId = pattern.attId;
	}
	
	public Skill(int id, String name, int level, boolean special, int attId) {
		this.id = id;      
		this.name = name;
		this.level = level;
		this.special = special;
		this.attId = attId;
	}
	
	public void incLevel() {
		level++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public boolean isSpecial() {
		return special;
	}

	/**
	 * each skill has a helper attribute
	 * @return
	 */
	public int getAttributeId() {
		return attId;
	}
}
