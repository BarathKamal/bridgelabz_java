package com.bridgelabz.design_patterns.structural_patterns;

/*
1. Program to demonstrate the Adapter Design pattern with an example
of Old Printer(Adaptee) and New Printer(Target)
2. Uses Object Adapter pattern (composition based)
 */

// Target interface
interface NewPrinter {
    void print();
}

// Adaptee class
class OldPrinter {
    public void oldPrint() {
        System.out.println("Old printer is printing...");
    }
}

// Adapter class implementing Target and contains OldPrinter object
class Adapter implements NewPrinter {
    OldPrinter oldPrinter = new OldPrinter();

    // directs to the oldPrint() method
    @Override
    public void print() {
        oldPrinter.oldPrint();
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.print();
    }
}
