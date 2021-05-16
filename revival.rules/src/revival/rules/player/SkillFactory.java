package revival.rules.player;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class SkillFactory implements Serializable {

	private static Map<Integer, Skill> skills;
	
	static {
		skills = new HashMap<Integer, Skill>();
		
		skills.put(1, new Skill(1, "Brawling", 1, false, 3));
		skills.put(2, new Skill(2, "Climb", 1, false, 5));
		skills.put(3, new Skill(3, "Clip pistol", 1, false, 6));
		skills.put(4, new Skill(4, "Knife fight", 1, false, 6));
		skills.put(5, new Skill(5, "Pugilism", 1, false, 1));
		skills.put(6, new Skill(6, "Rifle", 1, false, 6));
		skills.put(7, new Skill(7, "Swim", 1, false, 1));
		skills.put(8, new Skill(8, "Knife throw", 1, false, 6));
		skills.put(9, new Skill(9, "Perception", 1, false, 2));
		skills.put(10, new Skill(10, "Assault rifle", 1, false, 6));
		skills.put(11, new Skill(11, "AT weapon", 1, false, 6));
		skills.put(12, new Skill(12, "SMG", 1, false, 6));
		skills.put(13, new Skill(13, "Acrobat", 1, false, 5));
		skills.put(14, new Skill(14, "Gamble", 1, false, 3));
		skills.put(15, new Skill(15, "Picklock", 1, false, 6));
		skills.put(16, new Skill(16, "Silent move", 1, false, 5));
		skills.put(17, new Skill(17, "Combat shooting", 1, false, 4));
		skills.put(18, new Skill(18, "Confidence", 1, false, 7));
		skills.put(19, new Skill(19, "Sleight of hand", 1, false, 6));
		skills.put(20, new Skill(20, "Demolitions", 1, false, 2));
		skills.put(21, new Skill(21, "Forgery", 1, false, 6));
		skills.put(22, new Skill(22, "Alarm disarm", 1, false, 2));
		skills.put(23, new Skill(23, "Bureaucracy", 1, false, 7));
		skills.put(24, new Skill(24, "Bomb disarm", 1, false, 2));
		skills.put(25, new Skill(25, "Medic", 1, false, 2));
		skills.put(26, new Skill(26, "Safecrack", 1, false, 6));
		skills.put(27, new Skill(27, "Cryptology", 1, false, 2));
		skills.put(28, new Skill(28, "Metallurgy", 1, false, 2));
		skills.put(29, new Skill(29, "Helicopter pilot", 1, false, 6));
		skills.put(30, new Skill(30, "Electronics", 1, false, 2));
		skills.put(31, new Skill(31, "Toaster repair", 1, false, 2));
		skills.put(32, new Skill(32, "Doctor", 1, false, 2));
		skills.put(33, new Skill(33, "Clone tech", 1, false, 2));
		skills.put(34, new Skill(34, "Energy weapon", 1, false, 6));
		skills.put(35, new Skill(35, "Cyborg tech", 1, false, 2));
		//TODO special skills
	}
	
	public static Skill create(int skillNr, int level) {
		return new Skill(skills.get(skillNr), level);
	}
}
