package ru.maksim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    @Qualifier("myCat")
    private Pet pet;

    @Autowired
    public Person(@Qualifier("myCat") Pet pet) {
        this.pet = pet;
        System.out.println("-= Bean Person is created =-");
    }
//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println("-= Bean Person is created =-");
//    }

    public Person() {
        System.out.println("Bean Person is created");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Autowired
//    @Qualifier("dog")
//    public void setPet(Pet pet) {
//        System.out.println("Class Person: setPet");
//        this.pet = pet;
//    }

    public void call() {
        System.out.println("Person " + name + "-" + age + " say: ");
        System.out.println("Hello my pet");
        pet.say();
    }
}
