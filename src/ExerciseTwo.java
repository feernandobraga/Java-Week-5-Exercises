import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExerciseTwo {

    public static void main(String[] args) {

        //Write a Java program to associate the specified value with the
        //specified key in a HashMap to create a new hashmap of some
        //colors and their Hex Color Code and print out the map.
        HashMap<String, String> hashColours = new HashMap<>();
        hashColours.put("#FF0000", "red");
        hashColours.put("#FFD700","gold");
        hashColours.put("#FFFF00","yellow");
        hashColours.put("#008080","teal");


        System.out.println("The hashmaps looks something like this: " + hashColours.toString());


        //Update the above program to count the number of key-value mappings in a map
        System.out.println("The number of key-value pairs is: " + hashColours.size());


        //Update the above program to get the value of a specified key in a map
        System.out.println("My favourite color has the hex value of #008080 and its name is: " +hashColours.get("#008080"));


        //Update the above program to remove a specific mappings from a map
        hashColours.remove("#FF0000");
        System.out.println("After removing my least favourite colour the hashMap looks something like: " + hashColours.toString());


        //Update the above program to view of the keys contained in this map
        Set keys = hashColours.keySet();
        System.out.println("The remaining keys are: " + keys);
    }

}
