package org.example.autoWiring.annotationsBased.setterInjection.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {

    private long id;
    private String company;
    private Processor processor;

    public void setId(long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Setter-based Dependency Injection using @Autowired.
     *
     * - The @Autowired annotation on this setter method tells Spring to
     *   automatically inject a `Processor` bean when creating a `Laptop` instance.
     * - Spring looks for a matching bean of type `Processor` in the application context
     *   and injects it into this method.
     * - This approach is useful when the dependency can change dynamically after object creation.
     */
    @Autowired
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
