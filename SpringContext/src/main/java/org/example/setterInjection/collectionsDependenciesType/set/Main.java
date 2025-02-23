package org.example.setterInjection.collectionsDependenciesType.set;

import org.example.setterInjection.collectionsDependenciesType.set.beans.CarDealer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Initializing Spring Application Context
         * - `ClassPathXmlApplicationContext` loads the bean configuration from "beanConfig.xml".
         * - This XML file contains bean definitions for `CarDealer` objects and their dependencies.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjection/collectionsDependenciesType/set/beanConfig.xml");

        /*
         * Retrieving CarDealer Bean Instances
         * - Fetching `dealer1` and `dealer2` from the Spring container.
         * - These beans have a `Set<String>` collection injected via setter-based dependency injection.
         */
        CarDealer carDealer1 = applicationContext.getBean("dealer1", CarDealer.class);
        CarDealer carDealer2 = applicationContext.getBean("dealer2", CarDealer.class);

        /*
         * Printing the CarDealer Objects
         * - Calls the `toString()` method of `CarDealer`, assuming it's overridden.
         * - The output will include dealer details along with the injected car models.
         */
        System.out.println(carDealer1);
        System.out.println(carDealer2);

        /*
         * Closing the Application Context
         * - Properly shuts down the Spring container, ensuring resource cleanup.
         */
        applicationContext.close();
    }
}
