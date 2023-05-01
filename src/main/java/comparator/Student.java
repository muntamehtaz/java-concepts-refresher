package comparator;

// Class 1
// A class to represent a comparator.Student
public class Student {

    // Attributes of a student
    int rollNo;
    String name, address;

    // Constructor
    public Student(int rollNo, String name, String address)
    {

        // This keyword refers to current instance itself
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // Method of comparator.Student class
    // To print student details in main()
    public String toString()
    {

        // Returning attributes of comparator.Student
        return this.rollNo + " " + this.name + " "
                + this.address;
    }
}
