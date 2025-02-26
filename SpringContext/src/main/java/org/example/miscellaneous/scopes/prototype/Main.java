package org.example.miscellaneous.scopes.prototype;

import org.example.miscellaneous.scopes.prototype.beans.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` is used to read the XML file from the classpath.
         * - The XML file "beanConfig.xml" contains bean definitions for `Employee` objects.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("miscellaneous/scopes/prototype/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - In `prototype` scope, a new instance of the bean is created every time it is requested.
         * - Here, two `Employee` beans (employee1 and employee2) are fetched from the container.
         * - Since they are in `prototype` scope, both objects will have different memory addresses (hash codes).
         */
        Employee employee1 = applicationContext.getBean("emp1", Employee.class);
        Employee employee2 = applicationContext.getBean("emp1", Employee.class);

        /*
         * Printing hash codes to verify prototype scope.
         * - If `singleton` scope was used, both objects would have the same hash code.
         * - Since `prototype` is used, different instances are created, leading to different hash codes.
         */
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        /*
         * Closing the application context to release resources.
         * - Unlike singleton beans, prototype beans are **not fully managed** by the Spring container.
         * - Therefore, Spring does not call `destroy()` methods for prototype-scoped beans.
         */
        applicationContext.close();
    }
}
