package com.kreker.spring.spring_introduction.tests;

import com.kreker.spring.spring_introduction.MyConfig;
import com.kreker.spring.spring_introduction.Person;
import com.kreker.spring.spring_introduction.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Person person = context.getBean("personBean", Person.class);
//        person.callYouPet();

//        Pet petCat = context.getBean("catBean", Pet.class);
//        Pet petCat2 = context.getBean("catBean", Pet.class);
//       //petCat.say();
//        System.out.println(petCat.equals(petCat2));
//
//        Pet dog1 = context.getBean("dogBean", Pet.class);
//        Pet dog2 = context.getBean("dogBean", Pet.class);
//        System.out.println(dog1.equals(dog2));
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
       // person.callYouPet();

        context.close();
    }
}
