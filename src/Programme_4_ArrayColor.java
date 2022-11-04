/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
*/

import java.util.ArrayList;

public class Programme_4_ArrayColor {
    public static void main(String[] args) {
        ArrayList <String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Pink");
        colorList.add("Black");
        colorList.add("Yellow");
        System.out.println("Color collection list:");
        for (String color : colorList){
            System.out.println(color);
        }
    }
}
