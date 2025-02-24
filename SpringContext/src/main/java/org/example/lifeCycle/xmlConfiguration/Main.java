package org.example.lifeCycle.xmlConfiguration;

import org.example.lifeCycle.xmlConfiguration.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` is used to read the XML file from the classpath.
         * - The XML file "beanConfig.xml" contains bean definitions for `Person` objects.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCycle/xmlConfiguration/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - Since this bean has 'init' method configured, at the time of bean creation, that init method will be called once all the dependencies has been fulfilled.
         */
        Person person1 = applicationContext.getBean("person1", Person.class);

        /*
         * Printing the Person objects to the console.
         * - This calls the `toString()` method of the `Person` class, assuming it is overridden.
         */
        System.out.println(person1);

        /*
         * Closing the application context to release resources.
         * - This will call the 'destroy' method of this bean
         */
        applicationContext.close();
    }
}
