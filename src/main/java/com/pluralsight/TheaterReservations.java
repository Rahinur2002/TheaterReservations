package com.pluralsight;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        name = name.substring(name.lastIndexOf(" ")) + ", " + name.substring(0
        , (name.indexOf(" ")));

        System.out.println("Enter the date of the show(day/mm/yy):");
        String showDate = scanner.nextLine();

        System.out.println("How many tickets will you need?");
        int tickets = scanner.nextInt();
        scanner.nextLine();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate formatShowDate = LocalDate.parse(showDate, format);

        if (tickets >= 2) {
            System.out.println(tickets + " tickets reserved for " + formatShowDate +
              " under " + name);
        } else {
            System.out.println(tickets + "ticket reserved for " + formatShowDate +
                    " under " + name);
        }


        scanner.close();
    }
}
