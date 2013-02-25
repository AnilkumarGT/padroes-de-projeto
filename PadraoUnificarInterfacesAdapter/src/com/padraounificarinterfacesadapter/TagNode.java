package com.padraounificarinterfacesadapter;

import com.padraounificarinterfacesadapter.interfaces.XMLNode;

public class TagNode implements XMLNode {

	public TagNode(String tagName) {
	}

	public TagNode() {
	}

	// public void add(TagNode currentNode) {
	//
	// }
	// Substituir por interface comum
	public void add(XMLNode currentNode) {

	}

	public TagNode getParent() {
		return new TagNode();
	}

	public void addAttribute(String name, String value) {

	}

	public void addValue(String value) {

	}

}
