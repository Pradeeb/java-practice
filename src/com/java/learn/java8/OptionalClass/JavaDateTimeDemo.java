package com.java.learn.java8.OptionalClass;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeDemo {

    public static void main(String[] args) {

        // 1. Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today Date: " + today);

        // 2. Current Time
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        // 3. Date + Time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date & Time: " + dateTime);

        // 4. Custom Date
        LocalDate customDate = LocalDate.of(2025, 12, 25);
        System.out.println("Custom Date: " + customDate);

        // 5. Add / Subtract
        System.out.println("After 5 days: " + today.plusDays(5));
        System.out.println("Before 1 month: " + today.minusMonths(1));

        // 6. Get values
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());

        // 7. Compare Dates
        LocalDate oldDate = LocalDate.of(2020, 1, 1);
        System.out.println("Is today after 2020? " + today.isAfter(oldDate));

        // 8. Period (Date difference)
        Period diff = Period.between(oldDate, today);
        System.out.println("Difference: " + diff.getYears() + " years");

        // 9. Duration (Time difference)
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = t1.plusHours(2);
        Duration duration = Duration.between(t1, t2);
        System.out.println("Duration hours: " + duration.toHours());

        // 10. Format Date
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}