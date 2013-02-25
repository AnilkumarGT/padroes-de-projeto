package com.padraointerpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.padraointerpreter.criterio.AndSpec;
import com.padraointerpreter.criterio.BelowPriceSpec;
import com.padraointerpreter.criterio.ColorSpec;
import com.padraointerpreter.criterio.NotSpec;
import com.padraointerpreter.criterio.Spec;
import com.padraointerpreter.entidades.Product;
import com.padraointerpreter.enums.Color;

public class ProductFinder {
	private List<Product> repository = new ArrayList<Product>();

	public List<Product> byColor(Color colorOfProductToFind) {
		ColorSpec spec = new ColorSpec(colorOfProductToFind);
		return selectBy(spec);
		// List<Product> foundProducts = new ArrayList<Product>();
		// Iterator<Product> products = repository.iterator();
		// while (products.hasNext()) {
		// Product product = (Product) products.next();
		// // if (product.getColor().equals(colorOfProductToFind)) {
		// // if (product.getColor().equals(spec.getColorOfProductToFind())) {
		// if (spec.isSatisfiedBy(product)) {
		// foundProducts.add(product);
		// }
		// }
		// return foundProducts;
	}

	// private boolean isSatisfiedBy(ColorSpec spec, Product product) {
	// return product.getColor().equals(spec.getColorOfProductToFind());
	// }
	public List<Product> byColorAndBelowPrice(Color color, float price) {
		ColorSpec colorSpec = new ColorSpec(color);
		BelowPriceSpec priceSpec = new BelowPriceSpec(price);
		AndSpec spec = new AndSpec(colorSpec, priceSpec);
		return selectBy(spec);
		// List<Product> foundProducts = new ArrayList<Product>();
		// Iterator<Product> products = repository.iterator();
		// while (products.hasNext()) {
		// Product product = (Product) products.next();
		// // if (product.getPrice() < price && product.getColor() == color) {
		// // if (colorSpec.isSatisfiedBy(product)
		// // && priceSpec.isSatisfiedBy(product)){
		// // if (spec.getAugend().isSatisfiedBy(product)
		// // && spec.getAddend().isSatisfiedBy(product)) {
		// if (spec.isSatisfiedBy(product)) {
		// foundProducts.add(product);
		// }
		// }
		// return foundProducts;
	}

	public List<Product> belowPriceAvoidingAColor(float price, Color color) {
		AndSpec spec = new AndSpec(new BelowPriceSpec(price), new NotSpec(
				new ColorSpec(color)));
		return selectBy(spec);
		// List<Product> foundProducts = new ArrayList<Product>();
		// Iterator<Product> products = repository.iterator();
		// while (products.hasNext()) {
		// Product product = (Product) products.next();
		// // if (product.getPrice() < price && product.getColor() != color) {
		// if (spec.isSatisfiedBy(product)) {
		// foundProducts.add(product);
		// }
		// }
		// return foundProducts;
	}

	public List<Product> belowPrice(float price) {
		BelowPriceSpec spec = new BelowPriceSpec(price);
		return selectBy(spec);
	}

	private List<Product> selectBy(Spec spec) {
		List<Product> foundProducts = new ArrayList<Product>();
		Iterator<Product> products = repository.iterator();
		while (products.hasNext()) {
			Product product = (Product) products.next();
			if (spec.isSatisfiedBy(product)) {
				foundProducts.add(product);
			}
		}
		return foundProducts;
	}
}
