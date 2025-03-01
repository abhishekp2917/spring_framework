package org.example.autoWiring.annotationsBased.fieldInjection.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {

    private long id;
    private String company;

    // Field-based autowiring: Spring automatically injects a Processor bean into this field
    // without requiring explicit setter or constructor injection.
    @Autowired
    private Processor processor;

    public void setId(long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public Processor getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, company: %s , processor: %s]", id, company, processor);
    }
}
