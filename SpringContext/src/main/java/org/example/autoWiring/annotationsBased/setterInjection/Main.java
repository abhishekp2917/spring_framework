package org.example.autoWiring.annotationsBased.setterInjection;

import org.example.autoWiring.annotationsBased.setterInjection.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Initializing the Spring container using the XML configuration file.
        // This loads all the beans and their dependencies defined in beanConfig.xml.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoWiring/annotationsBased/setterInjection/beanConfig.xml");

        // Retrieving the Laptop bean from the Spring container.
        // The dependencies will be injected automatically using annotations.
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);

        // Printing the details of the Laptop object to verify if dependencies are correctly injected.
        System.out.println(laptop1);

        // Closing the application context to release resources.
        applicationContext.close();
    }
}
