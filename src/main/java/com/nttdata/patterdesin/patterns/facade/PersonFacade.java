package com.nttdata.patterdesin.patterns.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import com.nttdata.patterdesin.patterns.domain.Person;

public class PersonFacade {
	
	private final List<Person> persons;
	
	public PersonFacade() {
		persons = List.of(
				new Person("Pepito", 15),
				new Person("Manuel", 23),
				new Person("Carlos", 37),
				new Person("Agustin", 21)
				);
	}
	
	public List<Person> getPersonsBetweenAges(int minAge, int maxAge) {
		List<Person> foundPersons = persons.stream()
			.filter(x-> x.getAge() >= minAge && x.getAge() <= maxAge).toList();
		return foundPersons;
	}
	
	

}
