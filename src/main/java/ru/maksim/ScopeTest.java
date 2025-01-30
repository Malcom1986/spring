package ru.maksim;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext3.xml")) {

            Dog dog1 = context.getBean("dog", Dog.class);
            Dog dog2 = context.getBean("dog", Dog.class);

            System.out.println(dog1 == dog2);
        }
    }
}
