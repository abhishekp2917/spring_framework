package org.example.setterInjection.collectionsDependenciesType.map;

import org.example.setterInjection.collectionsDependenciesType.map.beans.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Initializing Spring Application Context
         * - `ClassPathXmlApplicationContext` loads the bean configuration from "beanConfig.xml".
         * - The XML file contains bean definitions for `Customer` and their dependencies.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjection/collectionsDependenciesType/map/beanConfig.xml");

        /*
         * Retrieving Customer Bean Instances
         * - Fetching `customer1` and `customer2` from the Spring container.
         * - These beans have a `Map<String, String>` property that gets injected via setter-based dependency injection.
         */
        Customer customer1 = applicationContext.getBean("customer1", Customer.class);
        Customer customer2 = applicationContext.getBean("customer2", Customer.class);

        /*
         * Printing the Customer Objects
         * - Calls the `toString()` method of `Customer`, assuming it's overridden.
         * - The output will include customer details along with the injected map of attributes.
         */
        System.out.println(customer1);
        System.out.println(customer2);

        /*
         * Closing the Application Context
         * - Properly shuts down the Spring container, ensuring resource cleanup.
         */
        applicationContext.close();
    }
}
