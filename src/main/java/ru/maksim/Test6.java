package ru.maksim;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Test6 {
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {
            Person person = context.getBean("personBean", Person.class);
            person.call();
//            Pet pet = context.getBean("catBean", Pet.class);
//            pet.say();
        }
    }
}
