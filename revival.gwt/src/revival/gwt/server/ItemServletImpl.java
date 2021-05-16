package revival.gwt.server;

import java.util.List;

import revival.gwt.client.service.ItemServlet;
import revival.rules.player.Item;
import revival.server.ItemRepository;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ItemServletImpl extends RemoteServiceServlet implements
		ItemServlet {

	@Override
	public List<Item> loadItems() {
		return ItemRepository.getInstance().getItems();
	}

}
