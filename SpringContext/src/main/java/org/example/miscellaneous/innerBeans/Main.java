package org.example.miscellaneous.innerBeans;

import org.example.miscellaneous.innerBeans.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` is used to read the XML file from the classpath.
         * - The XML file "beanConfig.xml" contains bean definitions for `Laptop` objects.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("miscellaneous/innerBeans/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - `applicationContext.getBean("beanName", ClassType.class)` fetches a bean by its ID.
         * - Here, three `Employee` beans (emp1, emp2, and emp3) are fetched and stored in variables.
         */
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);

        /*
         * Printing the Employee objects to the console.
         * - It displays laptop details along with processor dependency which is injected as inner beans.
         */
        System.out.println(laptop1);

        /*
         * Closing the application context to release resources ensuring proper cleanup of the Spring container.
         */
        applicationContext.close();
    }
}
