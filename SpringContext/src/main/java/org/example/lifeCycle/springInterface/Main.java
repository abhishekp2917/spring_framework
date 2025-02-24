package org.example.lifeCycle.springInterface;

import org.example.lifeCycle.springInterface.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` is used to read the XML file from the classpath.
         * - The XML file "beanConfig.xml" contains bean definitions for `Person` objects.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCycle/springInterface/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - After bean has been created and dependencies has been injected, spring will call 'afterPropertiesSet' method of InitializingBean interface as an init method.
         */
        Person person1 = applicationContext.getBean("person1", Person.class);

        /*
         * Printing the Person objects to the console.
         * - This calls the `toString()` method of the `Person` class, assuming it is overridden.
         */
        System.out.println(person1);

        /*
         * Closing the application context to release resources.
         * - This will call the 'destroy' method of DisposableBean interface.
         */
        applicationContext.close();
    }
}
