package com.ppzeff;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }
    public void callMyPet(){
        pet.say();
    }
}
