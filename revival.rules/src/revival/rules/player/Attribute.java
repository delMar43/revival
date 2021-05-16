package revival.rules.player;

public class Attribute implements Usable {

	private int id;
	private String name;
	private int level;
	private int offset; //for compatibility with original engine
	
	public Attribute() {
	}

	Attribute(int id, String name, int level, int offset) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.offset = offset;
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
	public void setLevel(int level) {
		this.level = level;
	}
	public void incLevel() {
		this.level++;
	}
	public int getOffset() {
		return offset;
	}
}
