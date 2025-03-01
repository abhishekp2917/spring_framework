package org.example.autoWiring.annotationsBased.fieldInjection.beans;

public class Processor {

    private long id;
    private String company;
    private double clockSpeed;

    public void setId(long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, company: %s , clockSpeed: %s]", id, company, clockSpeed);
    }
}
