package br.com.padraovisitor;

import br.com.padraovisitor.interfaces.NodeVisitor;

public class StringNode extends AbstractNode {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitStringNode(this);
	}

	public Object getText() {
		return null;
	}

}
