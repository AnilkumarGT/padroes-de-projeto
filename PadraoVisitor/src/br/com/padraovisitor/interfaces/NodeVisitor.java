package br.com.padraovisitor.interfaces;

import br.com.padraovisitor.EndTag;
import br.com.padraovisitor.LinkTag;
import br.com.padraovisitor.StringNode;
import br.com.padraovisitor.Tag;

public interface NodeVisitor {
	public void visitTag(Tag tag);

	public void visitEndTag(EndTag endTag);

	public void visitLinkTag(LinkTag linkTag);

	public void visitStringNode(StringNode stringNode);
}
