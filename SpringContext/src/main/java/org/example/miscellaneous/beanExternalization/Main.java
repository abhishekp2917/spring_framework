package org.example.miscellaneous.beanExternalization;

import org.example.miscellaneous.beanExternalization.beans.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Loading the Spring Application Context
         * - `ClassPathXmlApplicationContext` loads the XML configuration from the classpath.
         * - The XML file (`beanConfig.xml`) defines the Spring beans with externalized properties.
         */
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("miscellaneous/beanExternalization/beanConfig.xml");

        /*
         * Fetching Employee Beans from the Spring Container
         * - The bean definitions use property placeholders (`${...}`) to fetch values from `application.properties`.
         * - Spring replaces placeholders with actual values before injecting them into Employee objects.
         */
        Employee employee1 = applicationContext.getBean("emp1", Employee.class);
        Employee employee2 = applicationContext.getBean("emp2", Employee.class);

        /*
         * Displaying the Employee objects
         * - Values are dynamically injected from the external properties file.
         */
        System.out.println(employee1);
        System.out.println(employee2);

        /*
         * Closing the Application Context
         * - This ensures proper cleanup of the Spring container.
         * - If any beans implement `DisposableBean` or have a `destroy` method, they will be properly destroyed.
         */
        applicationContext.close();
    }
}
