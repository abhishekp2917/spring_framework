package org.example.lifeCycle.annotation;

import org.example.lifeCycle.annotation.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` is used to read the XML file from the classpath.
         * - The XML file "beanConfig.xml" contains bean definitions for `Person` objects.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCycle/annotation/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - After the bean creation, method annotated with @PostConstruct will be called upon.
         */
        Person person1 = applicationContext.getBean("person1", Person.class);

        /*
         * Printing the Person objects to the console.
         * - This calls the `toString()` method of the `Person` class, assuming it is overridden.
         */
        System.out.println(person1);

        /*
         * Closing the application context to release resources.
         * - This will call the method annotated with @PreDestroy
         */
        applicationContext.close();
    }
}
