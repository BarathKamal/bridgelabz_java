package com.bridgelabz.java_strings.extras_2;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneProblem {
    public static ZonedDateTime currentTime(String zoneId) {
        return ZonedDateTime.now(ZoneId.of(zoneId));
    }

    public static void main(String[] args) {

        System.out.println("Current time in GMT: " + currentTime("GMT"));
        System.out.println("Current time in IST: " + currentTime("Asia/Kolkata"));
        System.out.println("Current time in PST: " + currentTime("America/Los_Angeles"));
    }
}
