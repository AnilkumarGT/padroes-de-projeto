package com.padraoobserver;

import java.util.ArrayList;
import java.util.List;

import com.padraoobserver.entidades.Produto;
import com.padraoobserver.interfaces.ProductListener;

public class ProductSubject {
	List<ProductListener> observers = new ArrayList<ProductListener>();
	List<Produto> produtos = new ArrayList<Produto>();

	public void addObserver(ProductListener observer) {
		this.observers.add(observer);
	}

	public void removeObserver(ProductListener observer) {
		this.observers.remove(observer);
	}

	public void addProduct(Produto produto) {
		this.produtos.add(produto);
		for (ProductListener observer : this.observers) {
			observer.notification(produto);
		}
	}

}
