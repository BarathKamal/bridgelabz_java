package com.bridgelabz.dsa_linkedlist;

class TaskNode {

    private int id;
    private String name;
    private int priority;
    private String dueDate;
    private TaskNode next;

    public TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getDate() {
        return dueDate;
    }

    public TaskNode getNext() {
        return next;
    }

    public void setNext(TaskNode task) {
        next = task;
    }
}


class TaskCLL {

    private TaskNode head;
    private TaskNode tail;
    private TaskNode current;


    // Add task at beginning
    public void insertTaskAtBeginning(TaskNode task) {

        if (head == null) {
            task.setNext(task);
            head = task;
            tail = task;
            current = head;
            return;
        }

        task.setNext(head);
        tail.setNext(task);
        head = task;
    }


    // Add task at end
    public void insertTaskAtEnd(TaskNode task) {

        if (head == null) {
            task.setNext(task);
            head = task;
            tail = task;
            current = head;
            return;
        }

        task.setNext(head);
        tail.setNext(task);
        tail = task;
    }


    // Add task at specific position
    public void insertTaskAtPosition(TaskNode task, int position) {

        if (position < 1) {
            System.out.println("Invalid Position!");
            return;
        }

        if (position == 1) {
            insertTaskAtBeginning(task);
            return;
        }

        if (head == null) {
            System.out.println("Invalid Position!");
            return;
        }

        TaskNode curr = head;

        // Move to node before required position
        for (int i = 1; i < position - 1; i++) {

            curr = curr.getNext();

            // We came back to head -> position doesn't exist
            if (curr == head) {
                System.out.println("Invalid Position!");
                return;
            }
        }

        // Insert after curr
        task.setNext(curr.getNext());
        curr.setNext(task);

        // If inserted after tail, update tail
        if (curr == tail) {
            tail = task;
        }
    }


    // Remove task by ID
    public void removeTask(int id) {

        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        // Only one node
        if (head == tail) {

            if (head.getId() == id) {
                head = null;
                tail = null;
                current = null;
                System.out.println("Task removed!");
                return;
            }

            System.out.println("Task not found!");
            return;
        }

        // Remove head
        if (head.getId() == id) {

            head = head.getNext();
            tail.setNext(head);

            if (current.getId() == id) {
                current = head;
            }

            System.out.println("Task removed!");
            return;
        }

        TaskNode curr = head;

        while (curr.getNext() != head) {

            if (curr.getNext().getId() == id) {

                if (curr.getNext() == current) {
                    current = curr.getNext().getNext();
                }

                // If removing tail
                if (curr.getNext() == tail) {
                    tail = curr;
                }

                curr.setNext(curr.getNext().getNext());
                tail.setNext(head);

                System.out.println("Task removed!");
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("Task not found!");
    }


    // View current task and move to next task
    public void viewCurrentTask() {

        if (current == null) {
            System.out.println("Task list is empty!");
            return;
        }

        System.out.println("Current Task:");
        System.out.println("Task Id: " + current.getId());
        System.out.println("Task Name: " + current.getName());
        System.out.println("Task Priority: " + current.getPriority());
        System.out.println("Task Due Date: " + current.getDate());

        current = current.getNext();
    }


    // Display all tasks
    public void displayAllTasks() {

        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        System.out.println("Task List:");
        System.out.println("------------------------");

        TaskNode curr = head;

        do {

            System.out.println("Task Id: " + curr.getId());
            System.out.println("Task Name: " + curr.getName());
            System.out.println("Task Priority: " + curr.getPriority());
            System.out.println("Task Due Date: " + curr.getDate());
            System.out.println("------------------------");

            curr = curr.getNext();

        } while (curr != head);
    }


    // Search tasks by priority
    public void searchByPriority(int priority) {

        if (head == null) {
            System.out.println("Task list is empty!");
            return;
        }

        TaskNode curr = head;
        boolean found = false;

        do {

            if (curr.getPriority() == priority) {

                System.out.println(
                        "Task found: " + curr.getName()
                );

                found = true;
            }

            curr = curr.getNext();

        } while (curr != head);

        if (!found) {
            System.out.println(
                    "No task found with priority " + priority
            );
        }
    }
}


public class TaskSchedular {

    public static void main(String[] args) {

        TaskCLL taskList = new TaskCLL();

        TaskNode task1 =
                new TaskNode(1, "Complete Assignment", 2, "20-09-2026");

        TaskNode task2 =
                new TaskNode(2, "Study DSA", 1, "18-09-2026");

        TaskNode task3 =
                new TaskNode(3, "Attend Meeting", 3, "21-09-2026");

        TaskNode task4 =
                new TaskNode(4, "Submit Project", 1, "25-09-2026");


        // Add tasks
        taskList.insertTaskAtEnd(task1);
        taskList.insertTaskAtEnd(task2);
        taskList.insertTaskAtEnd(task3);

        // Add at beginning
        taskList.insertTaskAtBeginning(task4);

        // Display
        taskList.displayAllTasks();


        // Search by priority
        System.out.println("\nPriority Search:");
        taskList.searchByPriority(1);


        // View current task and move to next
        System.out.println("\nCurrent Tasks:");
        taskList.viewCurrentTask();
        taskList.viewCurrentTask();


        // Remove task
        System.out.println("\nRemoving Task 2:");
        taskList.removeTask(2);

        taskList.displayAllTasks();
    }
}
