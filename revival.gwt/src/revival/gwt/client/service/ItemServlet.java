package revival.gwt.client.service;

import java.util.List;

import revival.rules.player.Item;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("itemService")
public interface ItemServlet extends RemoteService {

	public List<Item> loadItems();
}
