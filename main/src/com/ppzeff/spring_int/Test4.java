package com.ppzeff.spring_int;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
//Pet pet = context.getBean("myPet", Pet.class);
//    pet.say();
    }
}
