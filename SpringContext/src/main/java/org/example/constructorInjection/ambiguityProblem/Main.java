package org.example.constructorInjection.ambiguityProblem;

import org.example.constructorInjection.ambiguityProblem.beans.Processor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
         * - `ClassPathXmlApplicationContext` is used to load the Spring application context.
         * - The XML file "beanConfig.xml" defines the beans and their dependencies.
         * - The configuration follows **Constructor Injection**, where dependencies are passed via constructors instead of setters.
         * - The file path should match the package structure where the XML is located.
         */
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("constructorInjection/ambiguityProblem/beanConfig.xml");

        /*
         * - `applicationContext.getBean("beanName", ClassType.class)` fetches beans by name and type.
         * - Each `Processor` bean demonstrates how constructor ambiguity is resolved:
         *    - `processor1`: No explicit type/index, might cause ambiguity.
         *    - `processor2`: Uses `type` attribute to ensure correct mapping.
         *    - `processor3`: Uses `long` types to avoid confusion with `int`.
         *    - `processor4`: Uses `index` to assign values to correct constructor parameters.
         */
        Processor processor1 = applicationContext.getBean("processor1", Processor.class);
        Processor processor2 = applicationContext.getBean("processor2", Processor.class);
        Processor processor3 = applicationContext.getBean("processor3", Processor.class);
        Processor processor4 = applicationContext.getBean("processor4", Processor.class);

        /*
         * - Each `Processor` bean is printed using its overridden `toString()` method.
         * - This helps verify that the correct values are injected into each instance.
         */
        System.out.println(processor1);
        System.out.println(processor2);
        System.out.println(processor3);
        System.out.println(processor4);

        /*
         * - Closing the Spring context ensures proper cleanup of resources.
         * - Beans implementing `DisposableBean` or having a `destroy` method get executed.
         */
        applicationContext.close();
    }
}
