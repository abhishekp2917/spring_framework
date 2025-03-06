package org.example.annotations.stereotype.service.beans;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

/**
 * The @Service annotation is a specialized stereotype annotation in Spring that marks this class as a service component.
 *
 * - It is a specialization of @Component, intended for business logic and service-layer classes.
 * - This annotation helps clarify the role of the class within the application architecture, distinguishing
 *   it from other components such as @Controller (for web layers) and @Repository (for persistence layers).
 * - While it functions similarly to @Component in terms of bean registration, using @Service improves readability
 *   and maintainability by clearly indicating that the class contains business logic.
 * - This class is automatically detected and registered as a Spring bean when component scanning is enabled.
 */
@Service
public class ProductService {

    /**
     * Simulates retrieving a list of products.
     * - In a real-world scenario, this method would interact with a repository (DAO) to fetch products from a database.
     * - Here, it simply returns a hardcoded list of products.
     */
    public List<String> getProducts() {
        return Arrays.asList("Frying Pan", "Sunscreen", "Running Shoes");
    }
}
