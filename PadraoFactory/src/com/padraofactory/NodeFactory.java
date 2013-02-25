package com.padraofactory;

import com.padraofactory.impl.Node;


//public class StringNodeParsingOption {
public class NodeFactory {
	private boolean decodeStringNodes;

	public Node createStringNode(StringBuffer textBuffer, int textBegin,
			int textEnd) {
		if (shouldDecodeStringNodes()) {
			return new DecodingStringNode(new StringNode(textBuffer, textBegin,
					textEnd));
		}
		return new StringNode(textBuffer, textBegin, textEnd);
	}

	public boolean shouldDecodeStringNodes() {
		return decodeStringNodes;
	}

	public void setDecodeStringNodes(boolean decodeStringNodes) {
		this.decodeStringNodes = decodeStringNodes;
	}

}
