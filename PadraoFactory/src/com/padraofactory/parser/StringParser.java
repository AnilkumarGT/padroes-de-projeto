package com.padraofactory.parser;

import com.padraofactory.NodeFactory;
import com.padraofactory.impl.Node;

public class StringParser {
	public Node find() {
		Parser parser = new Parser();
		StringBuffer textBuffer = new StringBuffer();
		int textBegin = 0;
		int textEnd = 0;
		// Criação a partir da factory

		// return StringNode.createStringNode(textBuffer, textBegin, textEnd,
		// parser.shoudDecodeNodes());
		NodeFactory nodeFactory = new NodeFactory();
		nodeFactory.setDecodeStringNodes(true);

		// Obtem estado da opção de decodificação de StringNode através da
		// classe StringNodeParsingOption

		// return nodeFactory.createStringNode(textBuffer, textBegin, textEnd,
		// Parser.shoudDecodeNodes());
		// return nodeFactory.createStringNode(textBuffer, textBegin, textEnd,
		// parser.getStringNodeParsingOption().shouldDecodeStringNodes());

		// return
		// parser.getStringNodeParsingOption().createStringNode(textBuffer,
		// textBegin, textEnd);
		return nodeFactory.createStringNode(textBuffer, textBegin, textEnd);
	}
}
