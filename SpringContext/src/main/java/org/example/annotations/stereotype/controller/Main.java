package org.example.annotations.stereotype.controller;

import org.example.annotations.stereotype.controller.beans.ProductController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * ClassPathXmlApplicationContext initializes the Spring application context using an XML configuration file.
         * - It scans the classpath for the specified XML file and loads the defined beans.
         * - Since ProductController is annotated with @Controller, it is automatically registered as a Spring bean.
         */
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("annotations/stereotype/controller/beanConfig.xml");

        /**
         * Retrieves the ProductController bean from the Spring container.
         * - Since @Controller is a specialization of @Component, Spring registers this class as a bean.
         * - No explicit bean name is provided, so Spring uses the default bean name (i.e., the class name with a lowercase first letter).
         * - Using getBean(ProductController.class) retrieves the bean by type.
         */
        ProductController controller = applicationContext.getBean(ProductController.class);

        /**
         * Calls the getProducts() method to retrieve the list of products.
         * - In a real-world MVC application, this method would typically be mapped to an HTTP endpoint
         *   using @RequestMapping, @GetMapping, or similar annotations.
         */
        List<String> products = controller.getProducts();

        // Prints the list of products.
        System.out.println(products);

        // Closes the application context to release resources.
        applicationContext.close();
    }
}
