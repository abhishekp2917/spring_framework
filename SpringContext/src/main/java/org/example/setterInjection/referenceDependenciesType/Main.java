package org.example.setterInjection.referenceDependenciesType;

import org.example.setterInjection.referenceDependenciesType.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` reads the "beanConfig.xml" file from the classpath.
         * - The XML file defines bean configurations for `Laptop` and its dependencies.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjection/referenceDependenciesType/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - `applicationContext.getBean("beanName", ClassType.class)` fetches the bean by its ID.
         * - Here, three `Laptop` objects (laptop1, laptop2, laptop3) are retrieved.
         */
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);
        Laptop laptop2 = applicationContext.getBean("laptop2", Laptop.class);
        Laptop laptop3 = applicationContext.getBean("laptop3", Laptop.class);

        /*
         * Printing the Laptop objects to the console.
         * - This calls the `toString()` method of the `Laptop` class, assuming it is overridden.
         * - The `Laptop` class has dependencies (e.g., `Processor`), which are injected via setter-based dependency injection.
         */
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);

        /*
         * Closing the application context to release resources.
         * - This ensures proper cleanup of the Spring container.
         * - Useful when beans implement the `DisposableBean` interface for resource cleanup.
         */
        applicationContext.close();
    }
}
