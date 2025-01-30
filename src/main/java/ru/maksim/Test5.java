package ru.maksim;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml")) {
            Dog pet = context.getBean("myPet", Dog.class);
            pet.say();

            Dog pet2 = context.getBean("myPet", Dog.class);
            pet2.say();

        }
    }
}
