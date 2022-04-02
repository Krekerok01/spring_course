package com.kreker.spring.spring_introduction.tests;

import com.kreker.spring.spring_introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYouPet();

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYouPet();
//        context.close();


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYouPet();
        System.out.println("Surname: " + person.getSurname() + ", age " + person.getAge());

        context.close();
    }
}
