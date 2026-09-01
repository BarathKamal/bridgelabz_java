package com.bridgelabz.java_oop_core;

import java.util.ArrayList;
import java.util.List;

/*
Program to demonstrate Inheritance, abstraction, encapsulation and polymorphism
using a Hospital Patient Management
 */

// Interface
interface MedicalRecord {
    void addRecord(String record);

    void viewRecords();
}

// Abstraction
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bill: ₹" + calculateBill());
    }
}

class InPatient extends Patient implements MedicalRecord {

    private double roomCharges;
    private double treatmentCharges;

    // Sensitive data kept private
    private List<String> medicalRecords = new ArrayList<>();

    public InPatient(int patientId, String name, int age,
                     double roomCharges, double treatmentCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.treatmentCharges = treatmentCharges;
    }

    // superclass method overriding
    @Override
    public double calculateBill() {
        return roomCharges + treatmentCharges;
    }

    // interface method overrding
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    // interface method overriding
    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : medicalRecords) {
            System.out.println("- " + record);
        }
    }
}

// Inheritance and Interface Implementation
class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private double testCharges;

    // Sensitive data kept private
    private List<String> medicalRecords = new ArrayList<>();

    public OutPatient(int patientId, String name, int age,
                      double consultationFee, double testCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    // superclass method overriding
    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
    }

    // interface method overriding
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    // interface method overriding
    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String record : medicalRecords) {
            System.out.println("- " + record);
        }
    }
}

public class HospitalPatientManagement {

    // Polymorphic method
    public static void displayBillingDetails(Patient patient) {
        patient.getPatientDetails();
    }

    public static void main(String[] args) {

        Patient inPatient =
                new InPatient(101, "Arun", 45, 5000, 10000);

        Patient outPatient =
                new OutPatient(102, "Kiran", 30, 1000, 1500);

        // Polymorphism
        displayBillingDetails(inPatient);
        System.out.println();

        displayBillingDetails(outPatient);
        System.out.println();

        // Interface reference
        MedicalRecord record = (MedicalRecord) inPatient;

        record.addRecord("Blood test completed");
        record.addRecord("Medication prescribed");

        record.viewRecords();
    }
}
