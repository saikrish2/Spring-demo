package com.example.demo.controller;

import com.example.demo.component.PatientDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    @Autowired
    PatientDetails PD;



    @GetMapping(value = "/getPD")
    public  String getPatientDetails(){

       //PD.setId(456987);
       PD.setName("sandhya");
//       PD.setAddress();
//       PD.setPatientId();
//       PD.getPhoneNo();
//       PD.
        return PD.getName();


    }

    @GetMapping(value = "/getPD/{id}")
    public static String getPatientDetailsById(@PathVariable("id") int number){

        if(number==1){

            return "Sandhya";
        }else if(number ==2){

            return "macbook";

        }
        return "sai";

    }



}
