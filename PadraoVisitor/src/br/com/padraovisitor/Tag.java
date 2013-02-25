package br.com.padraovisitor;

import br.com.padraovisitor.interfaces.NodeVisitor;

public class Tag extends AbstractNode {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitTag(this);
	}

	public String getTagName() {
		return null;
	}

}
