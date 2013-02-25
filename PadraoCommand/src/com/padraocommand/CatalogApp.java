package com.padraocommand;

import java.util.HashMap;
import java.util.Map;

public class CatalogApp {
	private static final String NEW_WORKSHOP = "new-workshop";
	private static final String ALL_WORKSHOPS = "all-workshops";

	private Map<String, Handler> handlers;

	public CatalogApp() {
		createHandlers();
	}

	private void createHandlers() {
		handlers = new HashMap<String, Handler>();
		handlers.put(NEW_WORKSHOP, new NewWorkshopHandler(this));
		handlers.put(ALL_WORKSHOPS, new AllWorkshopsHandler(this));
	}

	public HandlerResponse executeActionAndGetResponse(String handlerName,
			Map<String, String> parameters) throws Exception {
		Handler handler = lookupHandlerBy(handlerName);
		return handler.execute(parameters);

	}

	private Handler lookupHandlerBy(String handlerName) {
		return (Handler) handlers.get(handlerName);
	}
}
