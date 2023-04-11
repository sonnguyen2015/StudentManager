/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagement.model;

import java.io.Serializable;
/**
 *
 * @author hp
 */
public class Student implements Serializable {
    private String studentID;
    private String firstName;
    private String lastName;
    private String DoB;
    private Double gpa;
    private String address;

    public Student() {
    }

    public Student(String studentID, String firstName, String lastName, String DoB, Double gpa, String address) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DoB = DoB;
        this.gpa = gpa;
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", DoB=" + DoB + ", gpa=" + gpa + ", address=" + address + '}';
    }
    
    
    
}
