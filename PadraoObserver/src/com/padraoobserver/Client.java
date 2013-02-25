package com.padraoobserver;

import com.padraoobserver.entidades.Produto;
import com.padraoobserver.interfaces.ProductListener;

public class Client implements ProductListener {

	public Client createClient(ProductSubject productSubject) {
		productSubject.addObserver(this);
		return new Client();
	}

	@Override
	public void notification(Produto produto) {
		System.out.println("Add product. Observer client notify.");
	}

}
