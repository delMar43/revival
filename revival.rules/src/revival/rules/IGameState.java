package revival.rules;

import java.util.List;

import revival.rules.player.Party;

public interface IGameState {

	public List<Party> getParties();
	
	public Party getCurrentParty();
}
