package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        String first = getStringInput(scanner, "Enter your first name: ").trim();
        String middle = getStringInput(scanner, "Enter your middle name or initial: ").trim();
        String last = getStringInput(scanner, "Enter your last name: ").trim();
        String title = getStringInput(scanner, "Enter your title: ").trim();

        System.out.println(first + middle + last + title);

        first = first.replaceFirst( first.substring(0,1), first.substring(0,1).toUpperCase());

        if (middle.length() == 1) {
            middle = middle + ".";
        }
        if (!title.isBlank()) {
            title = ", " + title;
            title = title.toUpperCase();
        }

        System.out.println(first + " " + middle + " " + last + title);
    }

    public static String getStringInput (Scanner scanner, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input;
    }

}