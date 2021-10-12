package com.ppzeff.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary ");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void getMagazin() {
        System.out.println("Мы берем журнал из UniLibrary ");
    }

    public void returnMagazin() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
    }

    public void addMagazin() {
        System.out.println("Мы добавляем журнал в UniLibrary");
    }
}
