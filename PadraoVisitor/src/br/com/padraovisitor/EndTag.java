package br.com.padraovisitor;

import br.com.padraovisitor.interfaces.NodeVisitor;

public class EndTag extends AbstractNode {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitEndTag(this);
	}

	public String getTagName() {
		return null;
	}

}
