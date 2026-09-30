package com.bridgelabz.collections.queue_interface;

/*
Program to demonstrate the implementation of Priority queue
 */

import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {

        PriorityQueue<Patient> queue =
                new PriorityQueue<>((p1, p2) -> p2.severity - p1.severity);

        queue.offer(new Patient("John", 3));
        queue.offer(new Patient("Alice", 5));
        queue.offer(new Patient("Bob", 2));

        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println(patient.name + " - Severity: " + patient.severity);
        }
    }
}
