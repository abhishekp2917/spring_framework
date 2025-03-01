package org.example.autoWiring.annotationsBased.qualifier;

import org.example.autoWiring.annotationsBased.qualifier.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Initializing Spring's application context from the XML configuration file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoWiring/annotationsBased/qualifier/beanConfig.xml");

        // Retrieving the 'laptop1' bean from the application context
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);

        // Printing the Laptop object to check if the Processor is correctly injected
        System.out.println(laptop1);

        // Closing the application context to release resources
        applicationContext.close();
    }
}
