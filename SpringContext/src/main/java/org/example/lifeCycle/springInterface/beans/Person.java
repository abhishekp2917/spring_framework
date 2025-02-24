package org.example.lifeCycle.springInterface.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * The `Person` class implements `InitializingBean` and `DisposableBean` interfaces.
 * These interfaces are part of Spring's bean lifecycle management and help perform
 * initialization and destruction logic for a Spring-managed bean.
 *
 * When using these interfaces, there is no need to specify init and destroy methods in XML configuration.
 */
public class Person implements InitializingBean, DisposableBean {

    private long id;
    private String name;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * The `afterPropertiesSet()` method is part of the `InitializingBean` interface.
     * Spring calls this method after setting all properties of the bean.
     * This is useful when some initialization logic needs to be executed after dependency injection.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("Person[id: %d, name: %s] initialized successfully using InitializingBean interface method", id, name));
    }

    /**
     * The `destroy()` method is part of the `DisposableBean` interface.
     * Spring calls this method before destroying the bean.
     * This is useful for releasing resources, closing connections, or performing cleanup tasks.
     */
    @Override
    public void destroy() {
        System.out.println(String.format("Person[id: %d, name: %s] destroyed successfully using DisposableBean interface method", id, name));
    }

    @Override
    public String toString() {
        return String.format("[id: %d, name: %s]", id, name);
    }
}
