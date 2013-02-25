package com.padraounificarinterfacesadapter;

import com.padraounificarinterfacesadapter.interfaces.XMLNode;

public class DOMBuilder extends AbstractBuilder {
	private Document document;
	// private Element root;
	// private Element parent;
	// private Element current;

	private XMLNode root;
	private XMLNode parent;
	private XMLNode current;

	public void addAttribute(String name, String value) {
		// this.current.setAttribute(name, value);
		// this.current.getElement().setAttribute(name, value);
		// addAttribute(this.current, name, value);
		this.current.addAttribute(name, value);
	}

	// private void addAttribute(ElementAdapter current, String name, String
	// value) {
	// this.current.getElement().setAttribute(name, value);
	//
	// }

	public void addBelow(String child) {
		// Element childNode = this.document.createElement(child);
		// this.current.appendChild(childNode);
		XMLNode childNode = new ElementAdapter(
				this.document.createElement(child), this.document);
		this.parent = this.current;
		this.current = childNode;
		this.history.push(current);
	}

	public void addBeside(String sibling) {
		if (this.current == this.root) {
			throw new RuntimeException(CANNOT_ADD_BESIDE_ROOT);
		}
		// Element siblingNode = this.document.createElement(sibling);
		// this.parent.appendChild(siblingNode);
		XMLNode siblingNode = new ElementAdapter(
				this.document.createElement(sibling), this.document);
		((ElementAdapter) this.parent).getElement().appendChild(siblingNode);
		this.current = siblingNode;
		this.history.pop();
		this.history.push(this.current);
	}

	public void addValue(String value) {
		// this.current.appendChild(this.document.createTextNode(value));
		// this.current.appendChild(new ElementAdapter(this.document
		// .createTextNode(value)));
		this.current.addValue(value);
	}

	public void addChild(String childTagName) {
		XMLNode childNode = new ElementAdapter(
				this.document.createElement(childTagName), this.document);
		// add(this.current, childNode);
		// this.current.add(childNode);
		// this.current.getElement().appendChild(childNode.getElement());
		this.current.add(childNode);
		this.parent = this.current;
		this.current = childNode;
		this.history.push(this.current);

	}

	// private void add(ElementAdapter parent, ElementAdapter child) {
	// parent.getElement().appendChild(child.getElement());
	// }

	public void addSibling(String siblingTagName) {
		if (this.current == this.root) {
			throw new RuntimeException(CANNOT_ADD_BESIDE_ROOT);
		}
		XMLNode siblingNode = new ElementAdapter(
				this.document.createElement(siblingTagName), this.document);
		// this.parent.add(siblingNode);
		// this.parent.getElement().appendChild(siblingNode.getElement());
		this.current = siblingNode;
		this.history.pop();
		this.history.push(this.current);
	}
}
