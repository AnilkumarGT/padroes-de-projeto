package com.padraointerpreter.criterio;

import com.padraointerpreter.entidades.Product;

public class AndSpec extends Spec {
	private Spec augend;
	private Spec addend;

	public AndSpec(Spec augend, Spec addend) {
		this.augend = augend;
		this.addend = addend;
	}

	public Spec getAugend() {
		return augend;
	}

	public Spec getAddend() {
		return addend;
	}

	@Override
	public boolean isSatisfiedBy(Product product) {
		return getAugend().isSatisfiedBy(product)
				&& getAddend().isSatisfiedBy(product);
	}

}
