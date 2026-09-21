package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {

    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    abstract void displayRole();
}

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    public void displayRole() {
        System.out.println("Role: Software Engineer");
    }
}

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    public void displayRole() {
        System.out.println("Role: Data Scientist");
    }
}

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    public void displayRole() {
        System.out.println("Role: Product Manager");
    }
}


// T is bounded to JobRole.
// Therefore, Resume can only be associated with valid job roles.
class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void displayResume() {
        System.out.println("Candidate: " + candidateName);
        jobRole.displayRole();
        System.out.println("----------------------------");
    }
}


class ResumeUtility {

    // Wildcard allows the screening pipeline to process
    // lists containing any JobRole subtype.
    public static void screenResumes(
            List<? extends JobRole> roles) {

        for (JobRole role : roles) {
            System.out.println("AI Screening for:");
            role.displayRole();
        }
    }

    // Generic method can process a specific Resume type.
    public static <T extends JobRole> void processResume(
            Resume<T> resume) {

        System.out.println("Processing Resume:");
        resume.displayResume();
    }
}


public class AIResumeScreeningSystem {

    public static void main(String[] args) {

        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        // T = SoftwareEngineer
        Resume<SoftwareEngineer> resume1 =
                new Resume<>("Rahul", softwareEngineer);

        // T = DataScientist
        Resume<DataScientist> resume2 =
                new Resume<>("Priya", dataScientist);

        // T = ProductManager
        Resume<ProductManager> resume3 =
                new Resume<>("Arun", productManager);

        // Generic method processes different Resume types.
        ResumeUtility.processResume(resume1);
        ResumeUtility.processResume(resume2);
        ResumeUtility.processResume(resume3);

        // Wildcard example.
        List<SoftwareEngineer> softwareRoles = new ArrayList<>();
        softwareRoles.add(softwareEngineer);

        ResumeUtility.screenResumes(softwareRoles);
    }
}