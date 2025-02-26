package org.example.constructorInjection.primitiveDependenciesType;

import org.example.constructorInjection.primitiveDependenciesType.beans.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` is used to read the XML file from the classpath.
         * - The XML file "beanConfig.xml" contains bean definitions for `Employee` objects.
         * - Beans are initialized using **Constructor Injection**, where dependencies are passed via the constructor.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("constructorInjection/primitiveDependenciesType/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - `applicationContext.getBean("beanName", ClassType.class)` fetches a bean by its ID.
         * - Here, three `Employee` beans (emp1, emp2, and emp3) are fetched.
         * - Each `Employee` object is instantiated with constructor arguments defined in `beanConfig.xml`.
         */
        Employee employee1 = applicationContext.getBean("emp1", Employee.class);
        Employee employee2 = applicationContext.getBean("emp2", Employee.class);
        Employee employee3 = applicationContext.getBean("emp3", Employee.class);

        /*
         * Printing the Employee objects to the console.
         * - The `toString()` method of the `Employee` class is invoked to display the object state.
         * - Employee details are injected via **Constructor Injection**, ensuring immutability after object creation.
         */
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        /*
         * Closing the application context to release resources.
         * - This ensures proper cleanup of the Spring container, especially for beans that implement `DisposableBean`.
         */
        applicationContext.close();
    }
}
