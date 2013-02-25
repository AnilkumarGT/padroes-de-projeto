package com.padraofactorymethod.test;

import com.padraofactorymethod.OutputBuilder;

import junit.framework.TestCase;

public abstract class AbstractBuilderTest extends TestCase {
	private OutputBuilder builder;

	protected abstract OutputBuilder createBuilder(String rootName);

	public void testAddAboveRoot() {
		String invalidResult = "<orders>" + "<order>" + "</order>"
				+ "</orders>" + "<custumer" + "</custumer>";
		this.builder = createBuilder("orders");// era new XMLBuilder("orders")
		this.builder.addBelow("order");
		try {
			this.builder.addAbove("custumer");
			fail("expecting java.lang.RuntimeException");
		} catch (RuntimeException ignored) {
			// TODO: handle exception
		}

	}
}
