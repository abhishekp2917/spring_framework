package org.example.constructorInjection.primitiveDependenciesType.beans;

public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee(long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, firstName: %s , lastName: %s, age: %d]", id, firstName, lastName, age);
    }
}
