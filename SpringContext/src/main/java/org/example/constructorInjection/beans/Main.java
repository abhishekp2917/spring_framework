package org.example.constructorInjection;

import org.example.setterInjection.primitiveDependenciesType.beans.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterInjection/primitiveDependenciesType/beanConfig.xml");
        Employee employee1 = applicationContext.getBean("emp1", Employee.class);
        Employee employee2 = applicationContext.getBean("emp2", Employee.class);
        Employee employee3 = applicationContext.getBean("emp3", Employee.class);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}