package com.padraocommand;

import java.util.Map;

public abstract class Handler {
	protected CatalogApp catalogApp;

	public Handler(CatalogApp catalogApp) {
		this.catalogApp = catalogApp;
	}

	public abstract HandlerResponse execute(Map<String, String> parameters)
			throws Exception;
}
