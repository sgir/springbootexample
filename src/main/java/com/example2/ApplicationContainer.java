/*
 * Copyright (c) 2016 SAP SE or an SAP affiliate company. All rights reserved. 
 */

package com.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContainer {

    private Application app;

    // Dependency Injection pattern in action here :
    @Autowired
    public ApplicationContainer(Application App) {
        //System.out.println("working with (commandline) arguments : "+args.getSourceArgs());
        this.app = App;
    }

    public void startup(){
        app.run();
    }


}
