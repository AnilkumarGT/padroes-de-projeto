package com.padraofactorymethod.test;

import com.padraofactorymethod.DOMBuilder;
import com.padraofactorymethod.OutputBuilder;

public class DOMBuilderTest extends AbstractBuilderTest {

	@Override
	protected OutputBuilder createBuilder(String rootName) {
		return new DOMBuilder(rootName);
	}

	public void testFactoryMethod() {
		testAddAboveRoot();
	}
}
