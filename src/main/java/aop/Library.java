package aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("We take a book");
        System.out.println("-----------------------------------------");

    }

    public void returnBook() {
        System.out.println("We return a book");
        System.out.println("-----------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We take a magazine");
        System.out.println("-----------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return a magazine");
        System.out.println("-----------------------------------------");
    }

    public void addBook(String person, Book book) {
        System.out.println("We add a book");
        System.out.println("-----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add a magazine");
        System.out.println("-----------------------------------------");
    }

}
