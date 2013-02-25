package com.padraounificarinterfacesadapter;

import com.padraounificarinterfacesadapter.interfaces.XMLNode;

public class ElementAdapter implements XMLNode {
	private Element element;
	private Document document;

	public ElementAdapter(Element element, Document document) {
		this.element = element;
		this.document = document;
	}

	public Element getElement() {
		return element;
	}

	public void appendChild(ElementAdapter createTextNode) {

	}

	@Override
	public void addAttribute(String name, String value) {
		getElement().setAttribute(name, value);

	}

	@Override
	public void add(XMLNode child) {
		ElementAdapter childElement = (ElementAdapter) child;
		getElement().appendChild(childElement.getElement());
	}

	@Override
	public void addValue(String value) {
		getElement().appendChild(this.document.createTextNode(value));
	}
}
