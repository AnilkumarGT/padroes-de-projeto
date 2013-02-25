package com.padraounificarinterfacesadapter;

import com.padraounificarinterfacesadapter.interfaces.XMLNode;

public class XMLBuilder extends AbstractBuilder {
	private XMLNode rootNode;
	private XMLNode currentNode;
	
	public void addChild(String childTagName){
		addTo(this.currentNode,childTagName);
	}
	
	public void addSibling(String siblingTagName){
		addTo(((TagNode) this.currentNode).getParent(), siblingTagName);
	}

	private void addTo(XMLNode parentNode, String tagName) {
		this.currentNode = new TagNode(tagName);
		parentNode.add(this.currentNode);
	}
	public void addAttribute(String name,String value){
		this.currentNode.addAttribute(name,value);
	}
	public void addValue(String value){
		this.currentNode.addValue(value);
	}
}
