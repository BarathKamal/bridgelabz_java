package com.bridgelabz.java_object_modeling.practice_problems;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem:
 * Model a Hospital where Doctors and Patients interact
 * through consultations.
 *
 * Relationship:
 * Hospital -> contains Doctors and Patients
 * Doctor <-> Patient -> Association
 */

// Hospital class
public class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("Doctor: " + doctor.getName());
        }
    }

    public void displayPatients() {
        System.out.println("Patients in " + name + ":");
        for (Patient patient : patients) {
            System.out.println("Patient: " + patient.getName());
        }
    }
}


// Doctor class
class Doctor {
    private int id;
    private String name;

    public Doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
     * Communication method:
     * Doctor communicates with a Patient through consultation.
     */
    public void consult(Patient patient) {
        System.out.println(
                "Doctor " + name +
                        " is consulting Patient " + patient.getName()
        );
    }
}


// Patient class
class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


// Main class
class HospitalMain {
    public static void main(String[] args) {

        // Create a hospital
        Hospital hospital = new Hospital("Apollo Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor(1, "Dr. Kumar");
        Doctor doctor2 = new Doctor(2, "Dr. Ravi");

        // Create patients
        Patient patient1 = new Patient(1, "Prakash");
        Patient patient2 = new Patient(2, "Bala");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Doctor-patient associations through consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);

        doctor2.consult(patient1);
        doctor2.consult(patient2);

        System.out.println();

        // Display hospital's doctors and patients
        hospital.displayDoctors();
        hospital.displayPatients();
    }
}