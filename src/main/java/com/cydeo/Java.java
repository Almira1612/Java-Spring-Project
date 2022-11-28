package com.cydeo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java {
    //Field injection
    @Autowired
    OfficeHours officeHours;
    public void getTeachingHours(){

        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
