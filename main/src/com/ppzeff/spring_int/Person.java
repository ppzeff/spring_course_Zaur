package com.ppzeff.spring_int;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }
    public void callMyPet(){
        pet.say();
    }
}
