/*
Write a Java program to test an array list is empty or not. Define array list with
underground tube names
*/

import java.util.ArrayList;

public class Programme_7_TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> tube = new ArrayList<>();

        tube.add("Bakerloo");
        tube.add("Cirle");
        tube.add("Central");
        tube.add("Jubilee");
        tube.add("");
        tube.add("Piccadilly");
        System.out.println("Array list is:" + tube + "\n");

        for (String tubeName : tube) {
            if (tubeName.isEmpty()) {
                System.out.println("The Array list is empty");
            } else {
                System.out.println("The Array list is not empty");
            }
        }
    }
}
