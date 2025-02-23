package org.example.setterInjection.collectionsDependenciesType.property.beans;

import java.util.Properties;

public class Computer {

    private long id;
    private Properties properties;

    public void setId(long id) {
        this.id = id;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public long getId() {
        return id;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, properties: %s]", id, properties);
    }
}
