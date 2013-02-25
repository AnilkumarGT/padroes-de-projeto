package com.padraofactory;

import com.padraofactory.impl.Node;

public class NodeFactoryOld {
	// Não estatico para não prender o cliente a uma implementação desse tipo
	public Node createStringNode(StringBuffer textBuffer, int textBegin,
			int textEnd, boolean shoudDecodeNodes) {
		if (shoudDecodeNodes) {
			return new DecodingStringNode(new StringNode(textBuffer,
					textBegin, textEnd));
		}
		return new StringNode(textBuffer, textBegin, textEnd);
	}
}
