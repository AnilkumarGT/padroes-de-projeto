package br.com.padraovisitor;

import java.util.List;

import br.com.padraovisitor.interfaces.Node;
import br.com.padraovisitor.interfaces.NodeVisitor;

//Visitor
public class TextExtractor implements NodeVisitor {
	private Node parser;
	private List<Node> nodes;

	private boolean isPreTag;
	private boolean isScriptTag;
	private StringBuffer results;

	public String extractText() {
		Node node;
		// boolean isPreTag = false;
		// boolean isScriptTag = false;
		// StringBuffer results = new StringBuffer();

		for (Node nodeIterator : this.nodes) {
			nodeIterator.accept(this);

			// if (nodeIterator instanceof StringNode) {

			// StringNode stringNode = (StringNode) nodeIterator;
			// if (isPreTag) {
			// results.append(stringNode.getText());
			// } else {
			// String text = Translate.decode(stringNode.getText());
			// if (getReplaceNonBreakingSpace()) {
			// text = text.replace('\u00a0', ' ');
			// }
			// if (getCollapse()) {
			// collapse(results, text);
			// } else {
			// results.append(text);
			// }
			// }

			// accept((StringNode) nodeIterator);

			// ((StringNode) nodeIterator).accept(this);
			// } else if (nodeIterator instanceof LinkTag) {

			// LinkTag link = (LinkTag) nodeIterator;
			// if (isPreTag) {
			// results.append(link.getLinkText());
			// } else {
			// collapse(results, Translate.decode(link.getLinkText()));
			// }
			// if (getLinks()) {
			// results.append("<");
			// results.append(link.getLink());
			// results.append(">");
			//
			// }

			// accept((LinkTag) nodeIterator);

			// ((LinkTag) nodeIterator).accept(this);
			// } else if (nodeIterator instanceof EndTag) {

			// EndTag endTag = (EndTag) nodeIterator;
			// String tagName = endTag.getTagName();
			// if (tagName.equalsIgnoreCase("PRE")) {
			// isPreTag = false;
			// } else if (tagName.equalsIgnoreCase("SCRIPT")) {
			// isScriptTag = false;
			// } else if (nodeIterator instanceof Tag) {
			// Tag tag = (Tag) nodeIterator;
			// String _tagName = tag.getTagName();
			// if (_tagName.equalsIgnoreCase("PRE")) {
			// isPreTag = true;
			// } else if (_tagName.equalsIgnoreCase("SCRIPT")) {
			// isScriptTag = true;
			// }
			// }

			// accept((EndTag) nodeIterator);

			// ((EndTag) nodeIterator).accept(this);
			// } else if (nodeIterator instanceof Tag) {

			// Tag tag = (Tag)nodeIterator;
			// String _tagName = tag.getTagName();
			// if (_tagName.equalsIgnoreCase("PRE")) {
			// isPreTag = true;
			// } else if (_tagName.equalsIgnoreCase("SCRIPT")) {
			// isScriptTag = true;
			// }

			// accept((Tag) nodeIterator);

			// ((Tag) nodeIterator).accept(this);
			// }
		}
		return (results.toString());
	}

	// private void accept(Tag tag) {
	// visitTag(tag);
	// }

	public void visitTag(Tag tag) {
		String _tagName = tag.getTagName();
		if (_tagName.equalsIgnoreCase("PRE")) {
			isPreTag = true;
		} else if (_tagName.equalsIgnoreCase("SCRIPT")) {
			isScriptTag = true;
		}
	}

	// private void accept(EndTag endTag) {
	// visitEndTag(endTag);
	// }

	public void visitEndTag(EndTag endTag) {
		String tagName = endTag.getTagName();
		if (tagName.equalsIgnoreCase("PRE")) {
			isPreTag = false;
		} else if (tagName.equalsIgnoreCase("SCRIPT")) {
			isScriptTag = false;
		}
	}

	// private void accept(LinkTag link) {
	// visitLink(link);
	// }

	public void visitLinkTag(LinkTag link) {
		if (isPreTag) {
			results.append(link.getLinkText());
		} else {
			collapse(results, Translate.decode(link.getLinkText()));
		}
		if (getLinks()) {
			results.append("<");
			results.append(link.getLink());
			results.append(">");

		}
	}

	// private void accept(StringNode stringNode) {
	// visitStringNode(stringNode);
	// }

	public void visitStringNode(StringNode stringNode) {
		if (!isScriptTag) {
			if (isPreTag) {
				results.append(stringNode.getText());
			} else {
				String text = Translate.decode(stringNode.getText());
				if (getReplaceNonBreakingSpace()) {
					text = text.replace('\u00a0', ' ');
				}
				if (getCollapse()) {
					collapse(results, text);
				} else {
					results.append(text);
				}
			}
		}
	}

	private boolean getLinks() {
		return false;
	}

	private void collapse(StringBuffer results, String text) {

	}

	private boolean getCollapse() {
		return false;
	}

	private boolean getReplaceNonBreakingSpace() {
		return false;
	}
}
