package revival.rules.player;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.allen_sauer.gwt.log.client.Log;

public class Chara implements Serializable {

	private static final int MAX_ITEMS = 30;
	
	private Map<Integer, Attribute> attMap;
	
	private Long id;
	private String name;
	private Attribute strength;
	private Attribute iq;
	private Attribute luck;
	private Attribute speed;
	private Attribute agility;
	private Attribute dexterity;
	private Attribute charisma;
	private int skillPoints;
	
	private int maxCon; //max condition
	private int curCon; //current condition
	
	private int money;
	
	private boolean sex; //false = male, true = female
	
	private int nationality;
	
	private String rank;
	
	private List<Skill> skills;
	private List<Item> inventory;
	
	private boolean playerCharacter;
	
	private Item weapon; //equipped weapon (every item except armors will be used as weapon)
	private Armor armor; //equipped armor (only armor is used as armor)
	
	public Chara() {
		attMap = new HashMap<Integer, Attribute>();
	}
	
	public Chara(boolean isPlayerCharacter) {
		this();
		playerCharacter = isPlayerCharacter;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Attribute getAttribute(int index) {
		return attMap.get(index);
	}
	
	public Attribute getAttributeById(int id) {
		for (Attribute att: attMap.values()) {
			if (att.getId() == id) {
				return att;
			}
		}
		
		return null;
	}
	
	public Attribute getAttributeByOffset(int offset) {
		for (Attribute att: attMap.values()) {
			if (att.getOffset() == offset) {
				return att;
			}
		}
		
		return null;
	}
	
	public int getStrength() {
		return strength.getLevel();
	}
	public void setStrength(int strength) {
		try {
			this.strength.setLevel(strength);
		} catch (NullPointerException e) {
			this.strength = AttributeFactory.createStrength(strength);
			attMap.put(this.strength.getOffset(), this.strength);
		}
	}
	public int getIq() {
		return iq.getLevel();
	}
	public void setIq(int iq) {
		try {
			this.iq.setLevel(iq);
		} catch (NullPointerException e) {
			this.iq = AttributeFactory.createIq(iq);
			attMap.put(this.iq.getOffset(), this.iq);
		}
	}
	public int getLuck() {
		return luck.getLevel();
	}
	public void setLuck(int luck) {
		try {
			this.luck.setLevel(luck);
		} catch (NullPointerException e) {
			this.luck = AttributeFactory.createLuck(luck);
			attMap.put(this.luck.getOffset(), this.luck);
		}
	}
	public int getSpeed() {
		return speed.getLevel();
	}
	public void setSpeed(int speed) {
		try {
			this.speed.setLevel(speed);
		} catch (NullPointerException e) {
			this.speed = AttributeFactory.createSpeed(speed);
			attMap.put(this.speed.getOffset(), this.speed);
		}
	}
	public int getAgility() {
		return agility.getLevel();
	}
	public void setAgility(int agility) {
		try {
			this.agility.setLevel(agility);
		} catch (NullPointerException e) {
			this.agility = AttributeFactory.createAgility(agility);
			attMap.put(this.agility.getOffset(), this.agility);
		}
	}
	public int getDexterity() {
		return dexterity.getLevel();
	}
	public void setDexterity(int dexterity) {
		try {
			this.dexterity.setLevel(dexterity);
		} catch (NullPointerException e) {
			this.dexterity = AttributeFactory.createDexterity(dexterity);
			attMap.put(this.dexterity.getOffset(), this.dexterity);
		}
	}
	public int getCharisma() {
		return charisma.getLevel();
	}
	public void setCharisma(int charisma) {
		try {
			this.charisma.setLevel(charisma);
		} catch (NullPointerException e) {
			this.charisma = AttributeFactory.createCharisma(charisma);
			attMap.put(this.charisma.getOffset(), this.charisma);
		}
	}
	public int getSkillPoints() {
		return skillPoints;
	}
	public void setSkillPoints(int skillPoints) {
		this.skillPoints = skillPoints;
	}
	public int getMaxCon() {
		return maxCon;
	}
	public void setMaxCon(int maxCon) {
		this.maxCon = maxCon;
	}
	public int getCurCon() {
		return curCon;
	}
	public void setCurCon(int curCon) {
		this.curCon = curCon;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public boolean isFemale() {
		return sex;
	}
	public void setFemale(boolean sex) {
		this.sex = sex;
	}
	public int getNationality() {
		return nationality;
	}
	public void setNationality(int nationality) {
		this.nationality = nationality;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public Skill getSkill(int index) {
		return skills.get(index);
	}
	public Skill getSkillById(int skillId) {
		for (Skill skill : skills) {
			if (skill.getId() == skillId) {
				return skill;
			}
		}
		return null;
	}
	public List<Item> getInventory() {
		return inventory;
	}
	public void setInventory(List<Item> inventory) {
		this.inventory = inventory;
	}
	public Item getItem(int idx) {
		return inventory.get(idx);
	}
	public Item getItemById(int id) {
		for (Item item : inventory) {
			if (item.getId() == id) {
				return item;
			}
		}
		
		return null;
	}
	
	public boolean addItem(Item item) {
		if (inventory.size() < MAX_ITEMS) {
			inventory.add(item);
			
			return true;
		} else {
			return false;
		}
	}
	
	public void removeItem(int itemIdx) {
		try {
			inventory.remove(itemIdx);
		} catch (IndexOutOfBoundsException e) {
			Log.error("tried to remove item " + itemIdx + " but inventory does only contain " + inventory.size() + " items");
		}
	}
	
	public void equipItem(int itemIdx) {
		Item item = inventory.get(itemIdx);
		if (item instanceof Armor) {
			if (item == armor) { //unequip
				armor = null;
			} else {
				armor = (Armor)item; //equip
			}
		} else {
			if (item == weapon) { //unequip
				weapon = null;
			} else {				//equip
				weapon = item;
			}
		}
	}

	public boolean isPlayerCharacter() {
		return playerCharacter;
	}
	public void setPlayerCharacter(boolean playerCharacter) {
		this.playerCharacter = playerCharacter;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRank() {
		return rank;
	}
	
	public Item getWeapon() {
		return weapon;
	}
	
	public Armor getArmor() {
		return armor;
	}
}
