package org.example.setterInjection.collectionsDependenciesType.list.beans;

import java.util.List;

public class Hospital {

    private long id;
    private String name;
    private List<String> departments;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, name: %s, departments: %s]", id, name, departments);
    }
}
