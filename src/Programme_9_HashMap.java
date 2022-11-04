/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
*/

import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {
        Map<String,Integer> subjectList = new HashMap<>();
        subjectList.put("English", 1);
        subjectList.put("Maths", 2);
        subjectList.put("Science", 3);
        subjectList.put("Music", 4);
        subjectList.put("Art", 5);

        for (Map.Entry<String,Integer> subject : subjectList.entrySet()){
            System.out.println(subject);
        }
    }
}