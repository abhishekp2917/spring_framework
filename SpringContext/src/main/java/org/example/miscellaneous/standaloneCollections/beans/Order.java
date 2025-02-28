package org.example.miscellaneous.standaloneCollections.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Order {

    private long id;
    private List<String> items;
    private Set<String> categories;
    private Map<String, Double> priceMap;
    private Properties orderMetadata;

    public void setId(long id) {
        this.id = id;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }

    public void setPriceMap(Map<String, Double> priceMap) {
        this.priceMap = priceMap;
    }

    public void setOrderMetadata(Properties orderMetadata) {
        this.orderMetadata = orderMetadata;
    }

    public long getId() {
        return id;
    }

    public List<String> getItems() {
        return items;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public Map<String, Double> getPriceMap() {
        return priceMap;
    }

    public Properties getOrderMetadata() {
        return orderMetadata;
    }

    @Override
    public String toString() {
        return String.format("[id: %d, items: %s, categories: %s, priceMap: %s, orderMetadata: %s]", id, items, categories, priceMap, orderMetadata);
    }
}