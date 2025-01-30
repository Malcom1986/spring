package aop;

import org.springframework.stereotype.Component;

@Component
public class Library {
    public void getBook() {
        System.out.println("We take a book");

    }

    public void getMagazine() {
        System.out.println("We take a magazine");
    }
}
