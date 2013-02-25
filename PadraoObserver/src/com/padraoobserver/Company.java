package com.padraoobserver;

import com.padraoobserver.entidades.Produto;
import com.padraoobserver.interfaces.ProductListener;

public class Company implements ProductListener {

	public Company createCompany(ProductSubject productSubject) {
		productSubject.addObserver(this);
		return new Company();
	}

	@Override
	public void notification(Produto produto) {
		System.out.println("Add produto. Observer company notify.");
	}

}
