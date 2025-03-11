package org.example.annotations.context.componentScan;

import org.example.annotations.context.componentScan.beans.Person;
import org.example.annotations.context.componentScan.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        Person person1 = applicationContext.getBean("person1", Person.class);

        System.out.println(person1);

        applicationContext.close();
    }
}
