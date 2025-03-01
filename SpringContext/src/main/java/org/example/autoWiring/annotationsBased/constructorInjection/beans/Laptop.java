package org.example.autoWiring.annotationsBased.constructorInjection.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {

    private long id;
    private String company;
    private Processor processor;

    // Default constructor
    public Laptop() {
    }

    /**
     * Constructor-based dependency injection using the @Autowired annotation.
     * When a Laptop bean is created, Spring will automatically inject a Processor bean
     * into the constructor if a matching bean is available in the application context.
     * This ensures that the processor dependency is always satisfied at the time of object creation.
     *
     * @param processor The Processor instance injected by Spring
     */
    @Autowired
    public Laptop(Processor processor) {
        this.processor = processor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
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
