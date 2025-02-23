package org.example.setterInjection.collectionsDependenciesType.set.beans;

import java.util.Set;

public class CarDealer {

    private long id;
    private String name;
    private Set<String> models;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModels(Set<String> models) {
        this.models = models;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getModels() {
        return models;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, name: %s, models: %s]", id, name, models);
    }
}
