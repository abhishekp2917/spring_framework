package org.example.miscellaneous.scopes.prototype.beans;

public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private int age;

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void initialize() {
        System.out.println(String.format("Employee[id: %d, firstName: %s , lastName: %s, age: %d] initialized successfully", id, firstName, lastName, age));
    }

    public void destroy() {
        System.out.println(String.format("Employee[id: %d, firstName: %s , lastName: %s, age: %d] destroyed successfully", id, firstName, lastName, age));
    }

    @Override
    public String toString() {
        return String.format("[id: %d, firstName: %s , lastName: %s, age: %d]", id, firstName, lastName, age);
    }
}
