package com.padraonullobject.option;

public abstract class Option<T> {
	public static <T> Option<T> of(final T conteudo) {
		if (conteudo == null) {
			return new None<T>();
		} else {
			return new Some<T>() {
				public T get() {
					return conteudo;
				}
			};
		}
	}
}

abstract class Some<T> extends Option<T> {
	public abstract T get();
}

class None<T> extends Option<T> {
}
