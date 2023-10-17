package com.pluralsight;

public class Donut {
    String type;
    float price;
    float calories;
    String description;


    Donut() {
        type = "Glazed";
        price = 2;
        calories = 300;
        description = "Shiny";
    }
    Donut (String type, float calories, float price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;

    }

    public String toString() {
        return "Donut {" +
                "type = " + type +
                ", calories = '" + calories + '\'' +
                ", price = '" + price + '\'' +
                ", description = '" + description + '\'' +
                '}' + "\n";
    }

}
