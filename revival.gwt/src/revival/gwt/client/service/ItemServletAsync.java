package revival.gwt.client.service;

import java.util.List;

import revival.rules.player.Item;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ItemServletAsync {

	void loadItems(AsyncCallback<List<Item>> callback);

}
