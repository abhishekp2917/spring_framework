package org.example.autoWiring.xmlBased.beans;

public class Laptop {

    private long id;
    private String company;
    private Processor processor;
    private int storageInGB;

    public Laptop() {
    }

    public Laptop(Processor processor) {
        this.processor = processor;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setStorageInGB(int storageInGB) {
        this.storageInGB = storageInGB;
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

    public int getStorageInGB() {
        return storageInGB;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, company: %s , processor: %s, storageInGB: %d]", id, company, processor, storageInGB);
    }
}
