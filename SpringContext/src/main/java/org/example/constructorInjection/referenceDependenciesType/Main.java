package org.example.constructorInjection.referenceDependenciesType;

import org.example.constructorInjection.referenceDependenciesType.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` reads the "beanConfig.xml" file from the classpath.
         * - The XML file defines bean configurations for `Laptop` and its dependent beans.
         * - Beans are initialized using **Constructor Injection**, where dependencies are passed via the constructor.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjection/referenceDependenciesType/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - `applicationContext.getBean("beanName", ClassType.class)` fetches the bean by its ID.
         * - Here, two `Laptop` objects (laptop1, laptop2) are retrieved.
         * - Each `Laptop` object is instantiated with **constructor-based dependency injection**.
         */
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);
        Laptop laptop2 = applicationContext.getBean("laptop2", Laptop.class);

        /*
         * Printing the Laptop objects to the console.
         * - The `toString()` method of the `Laptop` class is invoked to display the object state.
         * - Dependencies (e.g., `Processor`) are injected via **Constructor Injection**, ensuring immutability.
         */
        System.out.println(laptop1);
        System.out.println(laptop2);

        /*
         * Closing the application context to release resources.
         * - This ensures proper cleanup of the Spring container.
         * - Useful when beans implement the `DisposableBean` interface for resource cleanup.
         */
        applicationContext.close();
    }
}
