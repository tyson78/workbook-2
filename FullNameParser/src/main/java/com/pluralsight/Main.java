package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your full name: ");
        Scanner scanner = new Scanner(System.in);
        String FullName = scanner.nextLine();

        String FirstName;
        String MiddleName;
        String LastName;

        String [] s = FullName.split(" ");
        FirstName = s[0].trim();
        FirstName = FirstName.substring(0,1).toUpperCase()+FirstName.substring(1);
        if(s.length == 2)
        {
            MiddleName = "(none)";
            LastName = s[1].trim();
            LastName = LastName.substring(0,1).toUpperCase()+LastName.substring(1);

        }
        else {

            MiddleName = s[1].trim();
            MiddleName = MiddleName.substring(0,1).toUpperCase()+MiddleName.substring(1);
            LastName = s[2].trim();
            LastName = LastName.substring(0,1).toUpperCase()+LastName.substring(1);
        }

        System.out.println("FirstName is: "+ FirstName + "\n Middle name is: "+ MiddleName + "\nLast name is: "+  LastName);
    }
}