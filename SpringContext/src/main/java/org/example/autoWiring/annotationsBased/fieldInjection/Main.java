package org.example.autoWiring.annotationsBased.fieldInjection;

import org.example.autoWiring.annotationsBased.fieldInjection.beans.Laptop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Initializing Spring's application context using the XML configuration file.
        // This loads the beans defined in the beanConfig.xml file.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoWiring/annotationsBased/fieldInjection/beanConfig.xml");

        // Retrieving the Laptop bean from the application context.
        // Spring will automatically inject dependencies using field-based autowiring.
        Laptop laptop1 = applicationContext.getBean("laptop1", Laptop.class);

        // Displaying the details of the Laptop object, including the injected dependencies.
        System.out.println(laptop1);

        // Closing the application context to release resources.
        applicationContext.close();
    }
}
