/*
 * Copyright (c) 2016 SAP SE or an SAP affiliate company. All rights reserved. 
 */

package com.example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApplication {

    public static void main(String[] args) {
        // Spring Annotation context :
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig    .class);
        // Factory Method Pattern in action here :
        ApplicationContainer app = context.getBean(ApplicationContainer.class);
        app.startup();
    }

}
