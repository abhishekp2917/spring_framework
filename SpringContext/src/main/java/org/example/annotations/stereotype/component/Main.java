package org.example.annotations.stereotype.component;

import org.example.annotations.stereotype.component.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /**
         * ClassPathXmlApplicationContext loads the Spring configuration from an XML file.
         * - It reads the specified XML file from the classpath and initializes the Spring container.
         * - This container scans for @Component-annotated beans and registers them in the application context.
         */
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("annotations/stereotype/component/beanConfig.xml");

        /**
         * Retrieves the "person1" bean from the Spring container.
         * - Since the Person class is annotated with @Component("person1"), it is automatically registered as a Spring bean.
         * - The getBean method fetches this bean by name and type.
         */
        Person person1 = applicationContext.getBean("person1", Person.class);

        // Prints the details of the retrieved bean.
        System.out.println(person1);

        // Closes the application context to release resources.
        applicationContext.close();
    }
}
