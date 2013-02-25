package com.padraoabstractfactory.impl;

import com.padraoabstractfactory.entidade.StringNode;
import com.padraoabstractfactory.interfac.NodeFactory;

public class StandardNodeFactory implements NodeFactory {

	@Override
	public StringNode createStringNode() {
		return new StringNode();
	}

}
