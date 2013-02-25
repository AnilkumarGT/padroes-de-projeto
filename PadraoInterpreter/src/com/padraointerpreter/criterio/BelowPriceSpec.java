package com.padraointerpreter.criterio;

import com.padraointerpreter.entidades.Product;

public class BelowPriceSpec extends Spec {
	private float priceThreshould;

	public BelowPriceSpec(float priceThreshould) {
		this.priceThreshould = priceThreshould;
	}

	@Override
	public boolean isSatisfiedBy(Product product) {
		return product.getPrice() < getPriceThreshould();
	}

	public float getPriceThreshould() {
		return priceThreshould;
	}

}
