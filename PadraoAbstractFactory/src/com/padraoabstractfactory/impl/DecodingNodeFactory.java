package com.padraoabstractfactory.impl;

import com.padraoabstractfactory.entidade.DecondingStringNode;
import com.padraoabstractfactory.entidade.StringNode;
import com.padraoabstractfactory.interfac.NodeFactory;

public class DecodingNodeFactory implements NodeFactory {

	@Override
	public StringNode createStringNode() {
		return new DecondingStringNode(new StringNode());
	}

}
