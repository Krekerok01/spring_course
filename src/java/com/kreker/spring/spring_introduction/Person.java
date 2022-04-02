package com.kreker.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;

//    @Autowired
//    public Person(@Qualifier("catBean")Pet pet) {
//        this.pet = pet;
//    }


    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

  //  public Person() {
  //      System.out.println("Person bean is created");
  //  }

//    @Autowired
//    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Class person set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void callYouPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
