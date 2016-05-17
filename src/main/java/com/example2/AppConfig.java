/*
 * Copyright (c) 2016 SAP SE or an SAP affiliate company. All rights reserved. 
 */

package com.example2;

import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class AppConfig {

    public  Application orderManagement(){
        System.out.println("Calls the Order Management Class ");
        return new OrderManagement();
    }

    public Application crm(){
        System.out.println("Calls the Order Management Class ");
        return new CRM();
    }

}




