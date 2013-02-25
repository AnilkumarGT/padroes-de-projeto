package br.com.padraovisitor;

import br.com.padraovisitor.interfaces.NodeVisitor;

public class LinkTag extends AbstractNode {

	@Override
	public void accept(NodeVisitor nodeVisitor) {
		nodeVisitor.visitLinkTag(this);
	}

	public Object getLinkText() {
		return null;
	}

	public Object getLink() {
		return null;
	}

}
