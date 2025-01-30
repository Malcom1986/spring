package ru.maksim;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class AnnotationConfig1 {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext3.xml")) {

            Person person = context.getBean("personBean", Person.class);
            person.call();



        }
    }
}
