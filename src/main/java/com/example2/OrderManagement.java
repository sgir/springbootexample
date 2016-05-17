/*
 * Copyright (c) 2016 SAP SE or an SAP affiliate company. All rights reserved. 
 */

package com.example2;

import org.springframework.stereotype.Component;

@Component
public class OrderManagement implements Application {

    @Override
    public void run() {
        System.out.println("OrderManagement running ... ");
    }
}
