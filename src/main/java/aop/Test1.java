package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            Library library = context.getBean("library", Library.class);
            library.getBook();
            library.getMagazine();
        }
    }
}