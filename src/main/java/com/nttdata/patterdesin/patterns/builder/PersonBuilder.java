package com.nttdata.patterdesin.patterns.builder;

import com.nttdata.patterdesin.patterns.domain.Person;

public class PersonBuilder {
	
	private Person person;
	
	public PersonBuilder(Person person) {
		this.person = person;	
	}
	
	//pongo esto como si fuese un ejemeplo de alguna otra funcionalidad
	public void deletePerson() {
		person = null;
	}

}
