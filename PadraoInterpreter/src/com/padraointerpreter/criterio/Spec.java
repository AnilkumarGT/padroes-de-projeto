package com.padraointerpreter.criterio;

import com.padraointerpreter.entidades.Product;

/**
 * Exemplo: Substituir linguagem implicita por Interpreter
 * 
 */
public abstract class Spec {
	public abstract boolean isSatisfiedBy(Product product);
}
