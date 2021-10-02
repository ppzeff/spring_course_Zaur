package com.ppzeff;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog creat");
    }

    @Override
    public void say() {
        System.out.println("Baow-woaw!");
    }

}
