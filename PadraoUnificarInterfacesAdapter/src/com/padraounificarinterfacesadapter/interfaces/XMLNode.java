package com.padraounificarinterfacesadapter.interfaces;

public interface XMLNode {
	public void add(XMLNode childNode);

	public void addAttribute(String attribute, String value);

	public void addValue(String value);
}
