package com.teamsmartworld;

import com.teamsmartworld.config.ComponentScanConfig;
import com.teamsmartworld.services.StudentManagement;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentManagement management = context.getBean(StudentManagement.class);
        management.start();

        context.close();
    }
}
