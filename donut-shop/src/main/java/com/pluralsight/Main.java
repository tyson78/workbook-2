package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Donut d = new Donut();
        System.out.println(d);

        Donut d1 = new Donut("cake", 300, 1, "cakey");
        Donut d2 = new Donut("vanilla", 400, 3, "white");
        Donut d3 = new Donut("chocolate", 500, 2, "dark brown");
        Donut d4 = new Donut("french curl", 600, 5, "curly");
        Donut d5 = new Donut("strawberry", 500, 9, "red");
        Donut d6 = new Donut("mango", 300, 7, "yellow");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        Donut myDonuts[] = new Donut[6];
        myDonuts[0] = d1;
        myDonuts[1] = d2;
        myDonuts[2] = d3;
        myDonuts[3] = d4;
        myDonuts[4] = d5;
        myDonuts[5] = d6;

        float totalPrice = 0;

        System.out.println("Printing out Donut attributes by looping through array \n");

        for (Donut donut : myDonuts) {
            System.out.println(donut + "\n");
            totalPrice += donut.price;
        }

        System.out.println("Total price of donuts is " + totalPrice);
    }
}

/** Project prompt
 * Project: donut-shop
 *
 * class:  Donut
 *
 * type, calories, price, description
 *
 * Generate constructor
 * Generate a toString method
 *
 * class: Main
 *
 * Make (use the new operator) at least 6 donuts and print them out
 * Save them in an array
 * Write a loop that goes through the array and prints out the donuts
 *
 * Extra credit:  print out the total price for the donuts
 * */