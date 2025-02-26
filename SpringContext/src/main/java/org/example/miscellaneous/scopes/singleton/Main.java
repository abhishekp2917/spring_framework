package org.example.miscellaneous.scopes.singleton;

import org.example.miscellaneous.scopes.singleton.beans.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * Creating a Spring application context by loading the XML configuration file.
         * - `ClassPathXmlApplicationContext` is used to read the XML file from the classpath.
         * - The XML file "beanConfig.xml" contains bean definitions for `Employee` objects.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("miscellaneous/scopes/singleton/beanConfig.xml");

        /*
         * Retrieving bean instances from the Spring container.
         * - In `singleton` scope, Spring creates only one instance of the bean per Spring container.
         * - Here, two `Employee` beans (employee1 and employee2) are fetched from the container.
         * - Since they share the same singleton instance, their memory addresses (hash codes) will be the same.
         */
        Employee employee1 = applicationContext.getBean("emp1", Employee.class);
        Employee employee2 = applicationContext.getBean("emp1", Employee.class);

        /*
         * Printing hash codes to verify singleton scope.
         * - If `prototype` scope was used, different instances would be created, resulting in different hash codes.
         * - Since `singleton` is used, both references point to the same instance, resulting in identical hash codes.
         */
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        /*
         * Closing the application context to release resources.
         * - Since singleton beans are managed fully by the Spring container, their destroy() methods (if defined) are called automatically on context close.
         */
        applicationContext.close();
    }
}
