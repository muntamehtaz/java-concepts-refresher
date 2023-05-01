package comparator;

import java.util.ArrayList;
import java.util.Collections;

// Main class
public class ComparatorExample {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of comparator.Student type
        ArrayList<Student> ar = new ArrayList<Student>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student(111, "Munta", "slp"));
        ar.add(new Student(131, "Grant", "ep"));
        ar.add(new Student(121, "Niketh", "slp"));
        ar.add(new Student(101, "Subhanga", "sa"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new SortByRoll());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by name
        Collections.sort(ar, new SortByName());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }

}
