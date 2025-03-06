package org.example.annotations.stereotype.service;

import org.example.annotations.stereotype.service.beans.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * ClassPathXmlApplicationContext initializes the Spring application context using an XML configuration file.
         * - It scans the classpath for the specified XML file and loads the defined beans.
         * - Since ProductService is annotated with @Service, it is automatically detected and registered as a Spring bean.
         */
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("annotations/stereotype/service/beanConfig.xml");

        /**
         * Retrieves the ProductService bean from the Spring container.
         * - The @Service annotation marks this class as a business logic component.
         * - Using getBean(ProductService.class) retrieves the bean by type, making it easy to access.
         */
        ProductService service = applicationContext.getBean(ProductService.class);

        /**
         * Calls the getProducts() method to fetch a list of products.
         * - In a real-world scenario, this method would interact with a repository (DAO) layer to retrieve products from a database.
         * - Here, it returns a hardcoded list of products for demonstration purposes.
         */
        List<String> products = service.getProducts();

        // Prints the list of products.
        System.out.println(products);

        // Closes the application context to release resources.
        applicationContext.close();
    }
}
