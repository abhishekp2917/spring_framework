package org.example.miscellaneous.beanExternalization.beans;

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

    @Override
    public String toString() {
        return String.format("[id: %d, firstName: %s , lastName: %s, age: %d]", id, firstName, lastName, age);
    }
}
