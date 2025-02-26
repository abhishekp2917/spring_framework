package org.example.lifeCycle.beanPostProcessor.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * The `Person` class demonstrates Spring Bean lifecycle using annotations.
 * The `@PostConstruct` and `@PreDestroy` annotations manage the initialization
 * and destruction lifecycle of the bean.
 */
public class Person {

    private long id;
    private String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * The `@PostConstruct` annotation marks this method as an initialization method.
     * - This method is automatically invoked by Spring **after the bean's properties are set**.
     * - Useful for performing setup tasks like opening connections or data validation.
     * - No need to implement any interface, making it more convenient than `InitializingBean`.
     */
    @PostConstruct
    public void initialize() {
        System.out.println(String.format("Person[id: %d, name: %s] initialized successfully using @PostConstruct annotation", id, name));
    }

    /**
     * The `@PreDestroy` annotation marks this method as a cleanup method.
     * - This method is automatically called by Spring **before the bean is destroyed**.
     * - Useful for resource cleanup, like closing database connections or releasing memory.
     * - No need to implement any interface, making it more convenient than `DisposableBean`.
     */
    @PreDestroy
    public void destroy() {
        System.out.println(String.format("Person[id: %d, name: %s] destroyed successfully using @PreDestroy annotation", id, name));
    }

    @Override
    public String toString() {
        return String.format("[id: %d, name: %s]", id, name);
    }
}
