import java.util.*;

public class ExerciseOne {

    public static void main(String[] args) {

        //Write a Java program to create a new array list,
        // add some colors (strings) and print out the collection
        ArrayList<String> colours = new ArrayList<String>(
                Arrays.asList("Blue", "Orange", "Red", "Purple", "Fuchsia")
        );

        System.out.println("Elements of array: " + colours.toString());

        //Update the above code to update the element at the first position in the list (add "Yellow")
        colours.add(0, "Yellow");

        System.out.println("\nElements of array after adding yellow: " + colours.toString());


        //Update the above code to retrieve an element (at a index 5) from a given array list
        System.out.println("\nRetrieving the element at index 5: " + colours.get(5).toString());


        //Update the above code to remove the third element from a array list and print out the collection
        colours.remove(3);

        System.out.println("\nElements of array with the element at index 3 removed: " + colours.toString());


        //Update the above code to search an element in a array list (Search for Yellow color)
        System.out.println("\nYellow is at index: " + colours.indexOf("Yellow"));


        //Update the above code to sort the array list and print the collection.
        Collections.sort(colours);
        System.out.println("\nThe sorted array is: " + colours.toString());

    }

}
