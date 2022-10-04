package com.nttdata.patterdesin.patterns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nttdata.patterdesin.patterns.decorator.PersonInterface;
import com.nttdata.patterdesin.patterns.domain.Person;
import com.nttdata.patterdesin.patterns.facade.PersonFacade;
import com.nttdata.patterdesin.patterns.facade.PersonProxyPresentacion;
import com.nttdata.patterdesin.patterns.proxy.PersonProxyI;
import com.nttdata.patterdesin.patterns.singleton.PersonSingletonEnum;

@SpringBootApplication
@ComponentScan(value = "com.nttdata")
public class PatternsApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    private PersonInterface personPrototype;

    public PatternsApplication(PersonInterface personPrototype) {
        this.personPrototype = personPrototype;
    }

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inicio...");

        System.out.println("=============================================================================");
        System.out.println("Prácticas con Singleton");
        System.out.println("=============================================================================");
        PersonSingletonEnum.INSTANCE.person().setName("Joselito");

        System.out.println(PersonSingletonEnum.INSTANCE.person().getName());

        System.out.println("Fin singleton");
        
        System.out.println("=============================================================================");
        System.out.println("Personas entre 20 y 30 años");
        System.out.println("=============================================================================");
        
        PersonFacade facade = new PersonFacade();
        List<Person> foundPersons = facade.getPersonsBetweenAges(20, 30);
        foundPersons.forEach(x -> System.out.println(x.getName()+", edad: "+x.getAge()));
        
        System.out.println("Fin facade");
        
        System.out.println("=============================================================================");
        System.out.println("Proxy");
        System.out.println("=============================================================================");
        
        PersonProxyPresentacion personProxy = new PersonProxyPresentacion(new PersonProxyI() {
			
			@Override
			public void presentarse() {
				System.out.println("Me llamo pepito");
			}
		});
        personProxy.presentarse();
    }
}
