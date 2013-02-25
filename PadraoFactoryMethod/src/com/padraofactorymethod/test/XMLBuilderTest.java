package com.padraofactorymethod.test;

import com.padraofactorymethod.OutputBuilder;
import com.padraofactorymethod.XMLBuilder;

public class XMLBuilderTest extends AbstractBuilderTest {

	@Override
	protected OutputBuilder createBuilder(String rootName) {
		return new XMLBuilder(rootName);
	}

	public void testFactoryMethod() {
		testAddAboveRoot();
	}
}
