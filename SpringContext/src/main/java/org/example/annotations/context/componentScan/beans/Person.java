package org.example.annotations.context.componentScan.beans;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    
    private long id;
    private String name;

    public Person() {
        this.id = 2;
        this.name = "Shivani Singh";
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
