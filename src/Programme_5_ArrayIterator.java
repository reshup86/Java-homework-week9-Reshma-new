/*
Write a Java program to iterate through all elements in an array list using
Iterator.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Programme_5_ArrayIterator {
    public static void main(String[] args) {

        Set<String> list =new HashSet();

        list.add("Bakerloo");
        list.add("Central");
        list.add("Circle");
        list.add("District");
        list.add("Jubilee");
        list.add("Piccadilly");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
