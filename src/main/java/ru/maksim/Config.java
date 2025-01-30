package ru.maksim;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
@PropertySource("classpath:myApp.properties")
public class Config {

//    @Bean
//    @Scope("singleton")
//    public Pet catBean() {
//        return new Cat();
//    }
//
//    @Bean
//    public Person personBean() {
//        return new Person(catBean());
//    }
}
