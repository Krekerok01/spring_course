package com.kreker.spring.spring_introduction.tests;

import com.kreker.spring.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
   //     myDog.setName("Jonny");
        Dog yourDog = context.getBean("myPet", Dog.class);
 //       yourDog.setName("Mila");

//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

        System.out.println("Переменные сслылаются на 1 объект?");
        System.out.println(myDog.equals(yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();
    }
}
