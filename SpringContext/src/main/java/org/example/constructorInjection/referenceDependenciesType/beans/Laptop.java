package org.example.constructorInjection.referenceDependenciesType.beans;

public class Laptop {

    private long id;
    private String company;
    private Processor processor;
    private int storageInGB;

    public Laptop(long id, String company, Processor processor, int storageInGB) {
        this.id = id;
        this.company = company;
        this.processor = processor;
        this.storageInGB = storageInGB;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, company: %s , processor: %s, storageInGB: %d]", id, company, processor, storageInGB);
    }
}
