package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class PatientDetails {
    public PatientDetails( ){

    }


    int id ;
    String name ;
    int patientId ;
    String Address ;
    int phoneNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public PatientDetails(int id, String name, int patientId, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.patientId = patientId;
        Address = address;
        this.phoneNo = phoneNo;
    }
}
