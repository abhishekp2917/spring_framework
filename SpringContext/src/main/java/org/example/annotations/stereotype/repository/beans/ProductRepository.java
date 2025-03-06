package org.example.annotations.stereotype.repository.beans;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

/**
 * The @Repository annotation is a specialization of @Component, used specifically for DAO (Data Access Object) classes.
 *
 * - It marks this class as a Spring-managed bean that handles data persistence and retrieval.
 * - This annotation provides additional benefits such as exception translation, where Spring automatically converts
 *   database-related exceptions (e.g., SQLException) into Spring’s DataAccessException, making error handling uniform.
 * - Although functionally similar to @Component, @Repository is intended to clearly indicate that this class
 *   interacts with a database or other data sources.
 * - It is typically used in the persistence layer of an application to abstract away database operations.
 */
@Repository
public class ProductRepository {

    /**
     * Simulates fetching a list of products.
     * - In a real-world scenario, this method would interact with a database using JDBC, JPA, or an ORM framework like Hibernate.
     * - Since this is a simple example, we return a hardcoded list of products.
     */
    public List<String> getProducts() {
        return Arrays.asList("Frying Pan", "Sunscreen", "Running Shoes");
    }
}
