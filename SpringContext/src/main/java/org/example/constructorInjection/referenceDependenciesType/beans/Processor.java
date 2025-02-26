package org.example.constructorInjection.referenceDependenciesType.beans;

public class Processor {

    private long id;
    private String company;
    private double clockSpeed;

    public Processor(long id, String company, double clockSpeed) {
        this.id = id;
        this.company = company;
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, company: %s , clockSpeed: %s]", id, company, clockSpeed);
    }
}
