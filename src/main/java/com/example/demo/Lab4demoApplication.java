package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.share.AppConfig;
import com.example.share.CompanyInformation;

@SpringBootApplication
public class Lab4demoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab4demoApplication.class, args);
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        CompanyInformation c1 = (CompanyInformation) context.getBean("companyInformation");
        c1.setName("ABC");
        c1.setTelephone("09411149");
        c1.printInfo();
    }
}
