package rework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and hour in 12-hour format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
        String formattedDateTime = now.format(formatter);

        // Extract the date and hour
        String date = formattedDateTime.substring(0, 10);
        String hour = formattedDateTime.substring(11, 13);

        // Print the result
        System.out.println("Date: " + date);
        System.out.println("Hour: " + hour);
    }
}