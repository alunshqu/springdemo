package com.alun;

import com.alun.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.alun");
        DemoService demoService = applicationContext.getBean(DemoService.class);
        try {
            demoService.updateAgeAndName(200, "李四1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
