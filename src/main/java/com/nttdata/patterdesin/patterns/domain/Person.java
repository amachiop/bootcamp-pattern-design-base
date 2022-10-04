package com.nttdata.patterdesin.patterns.domain;

import com.nttdata.patterdesin.patterns.clonable.Clonable;
import com.nttdata.patterdesin.patterns.decorator.PersonInterface;

public class Person implements PersonInterface, Clonable {

    private String name;

    private int age;

    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    
    @Override
    public Object clone() {
    	return new Person(this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.name;
    }

}
