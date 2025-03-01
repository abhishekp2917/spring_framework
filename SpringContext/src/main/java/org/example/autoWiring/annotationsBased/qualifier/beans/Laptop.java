package org.example.autoWiring.annotationsBased.qualifier.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
     * Setter-based Dependency Injection with @Autowired and @Qualifier
     *
     * - `@Autowired` enables Spring's automatic dependency injection.
     * - `@Qualifier("processor2")` explicitly specifies which bean to inject.
     *   - Without `@Qualifier`, if multiple `Processor` beans exist, Spring will not know which one to choose.
     *   - This annotation prevents ambiguity by selecting the exact bean named "processor2" from the context.
     */
    @Autowired
    @Qualifier("processor2")
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
