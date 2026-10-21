package com.bridgelabz.design_patterns.creational_patterns;

/*
Program to demonstrate the singleton design pattern
using logging system
 */

import java.util.List;
import java.util.ArrayList;

// Singleton class
class Logger {
    private static Logger logger; // shared instance
    private static List<String> logs;

    // private constructor
    private Logger() {
        logs = new ArrayList<>();
    }

    // static getInstance() method
    // lazy-initialization: classic java implementation of singleton design pattern
    // not thread-safe
    public static Logger getInstance() {
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

    // method to log messages
    public void log(String message) {
        logs.add(message);
    }

    // method to display the log history
    public static void displayLogs() {
        System.out.println("Log History: ");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        // multiple logger references with same logger instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        logger1.log("Message from logger 1");
        logger2.log("Message from logger 2");
        logger3.log("Message from logger 3");

        Logger.displayLogs();
    }
}
