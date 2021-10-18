package com.christerlenounoute;
import java.util.*;
public class Employee {
    int employeeId;
    String employeeName, employeeAddress, employeeEmail;
    int employeePhoneNumber;
    Employee(int id, String name,String address, String email,int phoneNumber){
        employeeId = id;
        employeeName = name;
        employeeAddress = address;
        employeeEmail = email;
        employeePhoneNumber = phoneNumber;
    }
    public String getName(){return employeeName;}
    public String getAddress(){return employeeAddress;}
    public String getEmail(){return employeeEmail;}
    public int getPhoneNumber(){return employeePhoneNumber;}
    public void setName(String name){employeeName = name;}
    public void setEmployeeAddress1(String address){employeeAddress = address;}
    public String toString(){
        return this.getName() + " Profile \n Email:" + this.getEmail() + "\n Address " + this.getAddress() + "\n Phone number: " + this.getPhoneNumber();
    }
}
