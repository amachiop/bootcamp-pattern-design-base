package com.nttdata.patterdesin.patterns.facade;

import com.nttdata.patterdesin.patterns.proxy.PersonProxyI;

public class PersonProxyPresentacion extends AbstractPersonProxy {

	public PersonProxyPresentacion(PersonProxyI person) {
		super(person);
	}

	@Override
	public void before() {
		System.out.println("Se va a presentar!!");
	}

	@Override
	public void after() {
		System.out.println("Ya se ha presentado");
	}

}
