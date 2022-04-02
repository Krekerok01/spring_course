package com.kreker.spring.spring_introduction.tests;

import com.kreker.spring.spring_introduction.Cat;
import com.kreker.spring.spring_introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");


        Person person = context.getBean("personBean", Person.class);
        person.callYouPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        context.close();
    }
}
