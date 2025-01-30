package ru.maksim;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext2.xml")) {

            Dog dog1 = context.getBean("myPet", Dog.class);
            dog1.setName("Barsik");

            Dog dog2 = context.getBean("myPet", Dog.class);
            dog2.setName("Barbos");
            System.out.println(dog1.getName());
            System.out.println(dog2.getName());

            System.out.println(dog1 == dog2);
            System.out.println(dog1);
            System.out.println(dog2);


        }

    }
}
