package comparator;

import java.util.Comparator;

// Class 2
// Helper class implementing Comparator interface
public class SortByRoll implements Comparator<Student> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {
        return a.rollNo - b.rollNo;
    }
}
