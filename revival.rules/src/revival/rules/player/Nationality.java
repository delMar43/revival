package revival.rules.player;

import java.io.Serializable;

public class Nationality implements Serializable {

	public static final int UNITEDSTATES = 1;
	public static final int RUSSIAN = 2;
	public static final int MEXICAN = 3;
	public static final int INDIAN = 4;
	public static final int CHINESE= 5;
	
	public static int getNationality(String string) {
		if (string.equalsIgnoreCase("US")) {
			return UNITEDSTATES;
		} else if (string.equalsIgnoreCase("Russian")) {
			return RUSSIAN;
		} else if (string.equalsIgnoreCase("Mexican")) {
			return MEXICAN;
		} else if (string.equalsIgnoreCase("Indian")) {
			return INDIAN;
		} else if (string.equalsIgnoreCase("Chinese")) {
			return CHINESE;
		} else {
			throw new RuntimeException("Invalid Nationalitystring: " + string);
		}
	}
	
	public static String getNationality(int nationality) {
		switch(nationality) {
		case 1:
			return ("U.S.");
		case 2:
			return("Russian");
		case 3:
			return("Mexican");
		case 4:
			return("Indian");
		case 5:
			return("Chinese");
		default:
			return "";
		}
	}
}
