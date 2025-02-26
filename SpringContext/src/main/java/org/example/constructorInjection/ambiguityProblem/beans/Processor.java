package org.example.constructorInjection.ambiguityProblem.beans;

public class Processor {

    private long id;
    private int core;
    private String company;

    public Processor(long id, long core, String company) {
        this.id = id;
        this.core = (int)core;
        this.company = company;
        System.out.println("Constructor(long id, long core, String company)");
    }

    public Processor(int id, int core, String company) {
        this.id = id;
        this.core = core;
        this.company = company;
        System.out.println("Constructor(int core, int id, String company)");
    }

    public Processor(long id, int core, String company) {
        this.id = id;
        this.core = core;
        this.company = company;
        System.out.println("Constructor(long id, int core, String company)");
    }

    @Override
    public String toString() {
        return String.format("[id: %d, core: %d, company: %s]", id, core, company);
    }
}
