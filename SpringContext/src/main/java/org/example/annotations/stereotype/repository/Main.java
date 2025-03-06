package org.example.annotations.stereotype.repository;

import org.example.annotations.stereotype.repository.beans.ProductRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * ClassPathXmlApplicationContext initializes the Spring application context using an XML configuration file.
         * - It scans the classpath for the specified XML file and loads the defined beans.
         * - Since ProductRepository is annotated with @Repository, it is automatically detected and registered as a Spring bean.
         */
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("annotations/stereotype/repository/beanConfig.xml");

        /**
         * Retrieves the ProductRepository bean from the Spring container.
         * - The @Repository annotation marks this class as a persistence component.
         * - Using getBean(ProductRepository.class) retrieves the bean by type, simplifying dependency management.
         */
        ProductRepository repository = applicationContext.getBean(ProductRepository.class);

        /**
         * Calls the getProducts() method to fetch a list of products.
         * - In a real-world scenario, this method would interact with a database to retrieve data.
         * - Here, it returns a hardcoded list of products for demonstration purposes.
         */
        List<String> products = repository.getProducts();

        // Prints the list of products.
        System.out.println(products);

        // Closes the application context to release resources.
        applicationContext.close();
    }
}
