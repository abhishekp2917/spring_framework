package org.example.autoWiring.xmlBased;

import org.example.autoWiring.xmlBased.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Initializing the Spring container using the XML configuration file.
        // This will load all the beans and their dependencies as defined in beanConfig.xml.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoWiring/xmlBased/beanConfig.xml");

        // Retrieving three Laptop beans from the Spring container.
        // These beans will have dependencies automatically injected based on the autowiring mechanism used.
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);
        Laptop laptop2 = applicationContext.getBean("laptop2", Laptop.class);
        Laptop laptop3 = applicationContext.getBean("laptop3", Laptop.class);

        // Printing the details of the Laptop objects to see how dependencies are injected.
        System.out.println(laptop1);
        System.out.println(laptop2);
        System.out.println(laptop3);

        // Closing the application context to release resources.
        applicationContext.close();
    }
}
