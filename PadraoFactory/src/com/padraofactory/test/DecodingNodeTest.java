package com.padraofactory.test;

import com.padraofactory.NodeFactory;
import com.padraofactory.parser.Parser;

public class DecodingNodeTest {
	public void testDecodeAmpersand() {
		Parser parser = new Parser();
		NodeFactory decodeNodes = new NodeFactory();
		decodeNodes.setDecodeStringNodes(true);
		// parser.setStringNodeParsingOption(decodeNodes);

		// parser.setNodeDecoding(true);

	}
}
