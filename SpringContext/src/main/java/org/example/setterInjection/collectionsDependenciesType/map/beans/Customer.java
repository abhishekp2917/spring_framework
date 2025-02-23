package org.example.setterInjection.collectionsDependenciesType.map.beans;

import java.util.List;
import java.util.Map;

public class Customer {

    private long id;
    private Map<Long, Double> invoices;
    private Map<Long, List<String>> orders;

    public void setId(long id) {
        this.id = id;
    }

    public void setInvoices(Map<Long, Double> invoices) {
        this.invoices = invoices;
    }

    public void setOrders(Map<Long, List<String>> orders) {
        this.orders = orders;
    }

    public long getId() {
        return id;
    }

    public Map<Long, Double> getInvoices() {
        return invoices;
    }

    public Map<Long, List<String>> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, invoices: %s, orders: %s]", id, invoices, orders);
    }
}
