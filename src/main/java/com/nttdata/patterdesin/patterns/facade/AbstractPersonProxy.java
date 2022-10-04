package com.nttdata.patterdesin.patterns.facade;

import com.nttdata.patterdesin.patterns.proxy.PersonProxyI;

public abstract class AbstractPersonProxy implements PersonProxyI {
	
	private PersonProxyI person;
	
	public AbstractPersonProxy(PersonProxyI person) {
		this.person = person;
	}

	@Override
	public void presentarse() {
		before();
		person.presentarse();
		after();
	}
	
	public abstract void before();

	public abstract void after();

}
