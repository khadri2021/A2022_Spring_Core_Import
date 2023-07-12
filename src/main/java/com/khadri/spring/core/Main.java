package com.khadri.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);
        Student student = context.getBean(Student.class);
        System.out.println(student);

    }
}