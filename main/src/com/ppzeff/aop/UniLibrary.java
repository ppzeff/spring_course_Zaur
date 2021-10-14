package com.ppzeff.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary ");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        System.out.println("--------------------------------");
        return "Война и мир";
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("--------------------------------");
    }

    public void getMagazin() {
        System.out.println("Мы берем журнал из UniLibrary ");
        System.out.println("--------------------------------");

    }

    public void returnMagazin() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("--------------------------------");

    }

    public void addMagazin() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("--------------------------------");

    }
}
