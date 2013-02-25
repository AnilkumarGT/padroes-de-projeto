package com.padraosingleton;

public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	public Singleton() {
		// configurações caso seja necessario.
	}

	public static synchronized Singleton getInstance() {
		return INSTANCE;
	}
}
