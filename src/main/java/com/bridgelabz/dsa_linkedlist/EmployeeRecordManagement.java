package com.bridgelabz.dsa_linkedlist;

/*
Program to create an Employee Management System and demonstrate Singly Linked List with its following operations:
1. Insertion at the start, middle and end
2. Deletion at the start, middle and end
3. Search
4. Update
*/

// Node class
class EmployeeNode {
    private int id;
    private String name;
    private String department;
    private double salary;
    private EmployeeNode next;

    public EmployeeNode(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.next = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public EmployeeNode getNext(){
        return next;
    }

    public void setNext(EmployeeNode employee){
        next = employee;
    }
}

// LinkedList class
class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    // Insertion at the beginning
    public void addEmployeeAtBeginning(EmployeeNode employee) {
        employee.setNext(head);
        head = employee;
        size++;
    }

    // Insertion at the end
    public void addEmployeeAtEnd(EmployeeNode employee){
        if (head == null) {
            head = employee;
            size++;
            return;
        }

        EmployeeNode last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(employee);
        size++;
    }

    // Insertion at a position
    public void addEmployeeAtPosition(EmployeeNode employee, int targetPosition) {
        if ((targetPosition < 1) || (targetPosition > size + 1)) { // size validation
            System.out.println("Enter a valid position");
            return;
        }

        if (targetPosition == 1) {
            addEmployeeAtBeginning(employee);
            return;
        }

        EmployeeNode curr = head;

        for (int i = 2; i < targetPosition;  i++) {
            curr = curr.getNext();
        }

        if (curr != null) {
            employee.setNext(curr.getNext());
            curr.setNext(employee);
            size++;
        }

    }

    // Deletion at the beginning
    public void deleteEmployeeAtBeginning() {
        if (head == null) {
            System.out.println("No elements in the linked list");
            return;
        }
        head = head.getNext();
        size--;
    }

    // Deletion at the end
    public void deleteEmployeeAtEnd() {
        if (head == null) {
            System.out.println("No elements in the linked list");
            return;
        }

        if (head.getNext() == null) {
            head = null;
            size--;
            return;
        }

        EmployeeNode secondLastNode = head;
        while(secondLastNode.getNext().getNext() != null) {
            secondLastNode = secondLastNode.getNext();
        }

        secondLastNode.setNext(null);
        size--;
    }

    // Deletion using specific id
    public void deleteEmployee(int id) {

        if (head == null) {
            System.out.println("No elements in the list");
            return;
        }

        if (head.getId() == id) {
            deleteEmployeeAtBeginning();
            return;
        }

        EmployeeNode curr = head;
        while (curr.getNext() != null) {
            if (curr.getNext().getId() == id) {
                curr.setNext(curr.getNext().getNext());
                size--;
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("Employee is not found!");
    }

    // Search using specific id
    public EmployeeNode searchEmployee(int id) {
        if (head == null) {
            System.out.println("No elements present in the list");
            return null;
        }

        EmployeeNode curr = head;
        while (curr != null) {
            if (curr.getId() == id) {
                return curr;
            }
            curr = curr.getNext();
        }

        System.out.println("No employee found with id " + id);
        return null;
    }

    // Displaying employee details
    public void displayEmployees() {
        EmployeeNode curr = head;
        System.out.println("Employee Details: ");
        for (int i = 0; i < size; i++) {
            System.out.println("EMPLOYEE " + (i + 1));
            System.out.println("Employee Id: " + curr.getId());
            System.out.println("Employee Name: " + curr.getName());
            System.out.println("Employee Department: " + curr.getDepartment());
            System.out.println("Employee Salary: " + curr.getSalary());
            System.out.println("---------------------------------------");
            curr = curr.getNext();
        }
    }
}

public class EmployeeRecordManagement {
    public static void main(String[] args) {

        EmployeeLinkedList employees = new EmployeeLinkedList();

        EmployeeNode emp1 =
                new EmployeeNode(101, "Rahul", "IT", 50000);

        EmployeeNode emp2 =
                new EmployeeNode(205, "Priya", "HR", 45000);

        EmployeeNode emp3 =
                new EmployeeNode(150, "Arun", "Finance", 55000);

        EmployeeNode emp4 =
                new EmployeeNode(310, "Divya", "Marketing", 48000);

        EmployeeNode emp5 =
                new EmployeeNode(120, "Karthik", "IT", 60000);


        // 1. Add at beginning
        employees.addEmployeeAtBeginning(emp1);

        // 2. Add at end
        employees.addEmployeeAtEnd(emp2);

        // 3. Add at beginning
        employees.addEmployeeAtBeginning(emp3);

        // 4. Add at a specific position
        employees.addEmployeeAtPosition(emp4, 2);

        // 5. Display employees
        employees.displayEmployees();


        // 6. Search employee by ID
        EmployeeNode employee = employees.searchEmployee(205);

        if (employee != null) {
            System.out.println("Employee Found:");
            System.out.println(employee.getId());
            System.out.println(employee.getName());
        }


        // 7. Delete employee by ID
        employees.deleteEmployee(150);


        // 8. Delete first employee
        employees.deleteEmployeeAtBeginning();


        // 9. Delete last employee
        employees.deleteEmployeeAtEnd();


        // 10. Display final list
        System.out.println("\nFinal Employee List:");
        employees.displayEmployees();
    }
}
