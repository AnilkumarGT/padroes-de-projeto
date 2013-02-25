package com.padraounificarinterfacesadapter;

import java.util.Stack;

import com.padraounificarinterfacesadapter.interfaces.OutputBuilder;
import com.padraounificarinterfacesadapter.interfaces.XMLNode;

public class AbstractBuilder implements OutputBuilder {
	protected static final String CANNOT_ADD_BESIDE_ROOT = "Cannot add beside root";
//	protected Stack<Element> history;
	protected Stack<XMLNode> history;
}
