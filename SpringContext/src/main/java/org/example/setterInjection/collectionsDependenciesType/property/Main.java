package org.example.setterInjection.collectionsDependenciesType.property;

import org.example.setterInjection.collectionsDependenciesType.property.beans.Computer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Initializing Spring Application Context
         * - `ClassPathXmlApplicationContext` loads the bean configuration from "beanConfig.xml".
         * - This XML file contains bean definitions for `Computer` objects and their dependencies.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjection/collectionsDependenciesType/property/beanConfig.xml");

        /*
         * Retrieving Computer Bean Instances
         * - Fetching `computer1` and `computer2` from the Spring container.
         * - These beans have a `Properties` object that gets injected via setter-based dependency injection.
         */
        Computer computer1 = applicationContext.getBean("computer1", Computer.class);
        Computer computer2 = applicationContext.getBean("computer2", Computer.class);

        /*
         * Printing the Computer Objects
         * - Calls the `toString()` method of `Computer`, assuming it's overridden.
         * - The output will include computer details along with the injected properties.
         */
        System.out.println(computer1);
        System.out.println(computer2);

        /*
         * Closing the Application Context
         * - Properly shuts down the Spring container, ensuring resource cleanup.
         */
        applicationContext.close();
    }
}
