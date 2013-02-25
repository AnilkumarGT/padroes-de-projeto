package com.padraofactory.parser;

import com.padraofactory.NodeFactory;

public class Parser {
	// private StringNodeParsingOption stringNodeParsingOption = new
	// StringNodeParsingOption();
	private NodeFactory nodeFactory = new NodeFactory();

	public NodeFactory getNodeFactory() {
		return nodeFactory;
	}

	public void setNodeFactory(NodeFactory nodeFactory) {
		this.nodeFactory = nodeFactory;
	}

	// private boolean shoulDecodeNodes = false;

	// public static boolean shoudDecodeNodes() {
	// return true;
	// }
	//
	// public void setShoulDecodeNodes(boolean shoulDecodeNodes) {
	// this.shoulDecodeNodes = shoulDecodeNodes;
	// }

	// public StringNodeParsingOption getStringNodeParsingOption() {
	// return stringNodeParsingOption;
	// }
	//
	// public void setStringNodeParsingOption(
	// StringNodeParsingOption stringNodeParsingOption) {
	// this.stringNodeParsingOption = stringNodeParsingOption;
	// }

}
