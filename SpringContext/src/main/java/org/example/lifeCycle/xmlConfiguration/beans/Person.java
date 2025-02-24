package org.example.lifeCycle.xmlConfiguration.beans;

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

    public void initialize() {
        System.out.println(String.format("Person[id: %d, name: %s] initialized successfully", id, name));
    }

    public void destroy() {
        System.out.println(String.format("Person[id: %d, name: %s] destroyed successfully", id, name));
    }

    @Override
    public String toString() {
        return String.format("[id: %d, name: %s]", id, name);
    }
}
