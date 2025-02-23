package org.example.setterInjection.collectionsDependenciesType.list;

import org.example.setterInjection.collectionsDependenciesType.list.beans.Hospital;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` reads "beanConfig.xml" from the classpath.
         * - The XML file defines bean configurations for `Hospital` and its dependencies.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjection/collectionsDependenciesType/list/beanConfig.xml");

        /*
         * Retrieving Hospital bean instances from the Spring container.
         * - `applicationContext.getBean("beanName", ClassType.class)` fetches the bean by its ID.
         * - Here, two `Hospital` objects (hospital1, hospital2) are retrieved.
         */
        Hospital hospital1 = applicationContext.getBean("hospital1", Hospital.class);
        Hospital hospital2 = applicationContext.getBean("hospital2", Hospital.class);

        /*
         * Printing the Hospital objects to the console.
         * - This calls the `toString()` method of the `Hospital` class, assuming it is overridden.
         * - The `Hospital` class contains a list of departments, injected via setter-based dependency injection.
         */
        System.out.println(hospital1);
        System.out.println(hospital2);

        /*
         * Closing the application context to release resources.
         * - This ensures proper cleanup of the Spring container.
         * - Useful when beans implement the `DisposableBean` interface for resource cleanup.
         */
        applicationContext.close();
    }
}
