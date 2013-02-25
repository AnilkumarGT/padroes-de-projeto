package com.padraointerpreter.criterio;

import com.padraointerpreter.entidades.Product;
import com.padraointerpreter.enums.Color;

public class ColorSpec extends Spec {
	private Color colorOfProductToFind;

	public ColorSpec(Color colorOfProductToFind) {
		this.colorOfProductToFind = colorOfProductToFind;
	}

	public Color getColorOfProductToFind() {
		return colorOfProductToFind;
	}

	@Override
	public boolean isSatisfiedBy(Product product) {
		return product.getColor().equals(getColorOfProductToFind());
	}
}
