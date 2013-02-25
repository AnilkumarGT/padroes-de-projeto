package com.padraofactory;

import com.padraofactory.impl.Node;

public class StringNode implements Node {
	private StringBuffer textBuffer;
	private int textBegin;
	private int textEnd;

	public StringNode(StringBuffer textBuffer, int textBegin, int textEnd) {
		this.textBuffer = textBuffer;
		this.textBegin = textBegin;
		this.textEnd = textEnd;
	}

	// Mover metodo de criação para factory
	// public static Node createStringNode(StringBuffer textBuffer, int
	// textBegin,
	// int textEnd, boolean shoudDecodeNodes) {
	// if (shoudDecodeNodes) {
	// return new DecondingStringNode(new StringNode(textBuffer,
	// textBegin, textEnd));
	// }
	// return new StringNode(textBuffer, textBegin, textEnd);
	// }

	public StringBuffer getTextBuffer() {
		return textBuffer;
	}

	public void setTextBuffer(StringBuffer textBuffer) {
		this.textBuffer = textBuffer;
	}

	public int getTextBegin() {
		return textBegin;
	}

	public void setTextBegin(int textBegin) {
		this.textBegin = textBegin;
	}

	public int getTextEnd() {
		return textEnd;
	}

	public void setTextEnd(int textEnd) {
		this.textEnd = textEnd;
	}

}
