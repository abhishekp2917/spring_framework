package org.example.autoWiring.annotationsBased.constructorInjection;

import org.example.autoWiring.annotationsBased.constructorInjection.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Loading the Spring application context from the specified XML configuration file.
        // This initializes the Spring container and registers the beans defined in the configuration.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoWiring/annotationsBased/constructorInjection/beanConfig.xml");

        // Retrieving the 'laptop1' bean from the application context.
        // Since constructor-based autowiring is used, dependencies are injected via the constructor.
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);

        // Printing the laptop details to verify if dependencies are correctly injected.
        System.out.println(laptop1);

        // Closing the application context to release resources and ensure proper cleanup.
        applicationContext.close();
    }
}
