/*
Write a Java program to retrieve an element (at a specified index) from a given
array list
*/

import java.util.ArrayList;

public class Programme_6_RetrieveArray {
    public static void main(String[] args) {
        ArrayList<String> chocolates = new ArrayList<>();
        chocolates.add("Cadbury");
        chocolates.add("Celebration");
        chocolates.add("Galaxy");
        chocolates.add("Nestle");
        chocolates.add("Lindt");

        System.out.println(chocolates.get(4));
    }
}
