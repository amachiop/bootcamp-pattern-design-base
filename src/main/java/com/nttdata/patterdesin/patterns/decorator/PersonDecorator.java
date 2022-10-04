package com.nttdata.patterdesin.patterns.decorator;

public class PersonDecorator implements PersonInterface {
	
	private PersonInterface personI;
	
	public PersonDecorator(PersonInterface personI) {
		this.personI = personI;
	}

	//lo modifico, como si fuese un ejemplo de lo que se podria hacer
	@Override
	public String getName() {
		String name;
		if(personI.getName() == null) {
			name="Nombre desconocido";
		}else {
			name=personI.getName();
		}
		return name;
	}

	@Override
	public void setName(String name) {
		personI.setName(name);
		
	}

	@Override
	public int getAge() {
		return personI.getAge()+1;
	}

	@Override
	public void setAge(int age) {
		personI.setAge(age);
	}

}
