package org.example.annotations.stereotype.component.beans;

import org.springframework.stereotype.Component;

/**
 * The @Component annotation marks this class as a Spring-managed bean.
 * - It enables Spring to automatically detect this class for dependency injection.
 * - The optional value ("person1") assigns a specific bean name, which can be used when retrieving it from the ApplicationContext.
 * - If no name is provided, Spring assigns a default name based on the class name (e.g., "person" for this class).
 */
@Component("person1")
public class Person {

    private long id;
    private String name;

    public Person() {
        this.id = 1;
        this.name = "Abhishek Pandey";
    }

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

    @Override
    public String toString() {
        return String.format("[id: %d, name: %s]", id, name);
    }
}
