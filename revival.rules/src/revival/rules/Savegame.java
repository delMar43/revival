package revival.rules;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import revival.rules.player.Chara;
import revival.rules.player.Party;

public class Savegame implements Serializable {

	private int curParty;
	private List<Party> parties = new ArrayList<Party>();
	
	public void setCurParty(int curParty) {
		this.curParty = curParty;
	}
	public int getCurParty() {
		return curParty;
	}
	
	public void addParty(Party party) {
		parties.add(party);
	}
	
	public void addMember(int partyNr, Chara chara) {
		parties.get(partyNr).addMember(chara);
	}
	
	public List<Party> getParties() {
		return parties;
	}
}
