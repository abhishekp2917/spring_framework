package org.example.annotations.stereotype.controller.beans;

import org.springframework.stereotype.Controller;
import java.util.Arrays;
import java.util.List;

/**
 * The @Controller annotation is a specialized Spring stereotype annotation used to define a Spring MVC controller.
 *
 * - It marks this class as a Spring-managed component, allowing it to be auto-detected during classpath scanning.
 * - Unlike @Component, @Controller is specifically used in Spring MVC applications to handle web requests.
 * - It is typically used to define request-handling methods, returning views or responses to the client.
 * - When used in conjunction with @RequestMapping (or similar annotations like @GetMapping, @PostMapping),
 *   it enables request routing.
 * - This annotation is functionally equivalent to @Component but carries additional semantics for MVC controllers.
 */
@Controller
public class ProductController {

    /**
     * Simulates fetching a list of products.
     * - In a real-world application, this method would typically interact with a service layer
     *   or database to fetch product data.
     * - Since there are no request-handling annotations like @GetMapping, this method
     *   is not mapped to an HTTP endpoint directly.
     */
    public List<String> getProducts() {
        return Arrays.asList("Frying Pan", "Sunscreen", "Running Shoes");
    }
}
