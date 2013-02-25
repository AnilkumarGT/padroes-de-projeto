package com.padraointerpreter.criterio;

import com.padraointerpreter.entidades.Product;

public class NotSpec extends Spec {
	private Spec specToNegate;

	public NotSpec(Spec specToNegate) {
		this.specToNegate = specToNegate;
	}

	@Override
	public boolean isSatisfiedBy(Product product) {
		return !specToNegate.isSatisfiedBy(product);
	}

}
