package org.example.miscellaneous.standaloneCollections;

import org.example.miscellaneous.standaloneCollections.beans.Order;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
         * Loading the Spring Application Context from the XML configuration file.
         * - This initializes the Spring container and registers all beans defined in `beanConfig.xml`.
         * - `ClassPathXmlApplicationContext` loads the configuration file from the classpath.
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("miscellaneous/standaloneCollections/beanConfig.xml");

        /*
         * Retrieving beans from the Spring context.
         * - Since we defined two order beans (`order1` and `order2`), we fetch them using `getBean()`.
         * - The `getBean("beanName", ClassType.class)` method returns an instance of the requested bean.
         */
        Order order1 = applicationContext.getBean("order1", Order.class);
        Order order2 = applicationContext.getBean("order2", Order.class);

        /*
         * Printing the retrieved Order objects to the console.
         * - The `toString()` method of the Order class (if implemented) will display order details.
         * - If `toString()` is not overridden, the default Java Object representation will be printed.
         */
        System.out.println(order1);
        System.out.println(order2);

        /*
         * Closing the application context to release resources.
         * - Ensures proper cleanup of the Spring container.
         * - This step is necessary in standalone applications to prevent resource leaks.
         */
        applicationContext.close();
    }
}
