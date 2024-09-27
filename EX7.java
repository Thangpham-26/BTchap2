import java.util.Arrays;

class Person {
    private String name;
    private int age;
    private String address;

    // Constructor for Person
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display Person information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

// Teacher class inherits from Person
class Teacher extends Person {
    private String institutionName;
    private String[] courses;

    // Constructor for Teacher
    public Teacher(String name, int age, String address, String institutionName, String[] courses) {
        // Calling the parent (Person) constructor
        super(name, age, address);
        this.institutionName = institutionName;
        this.courses = courses;
    }

    // Method to display Teacher information
    public void displayTeacherInfo() {
        displayPersonInfo();
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Courses: " + Arrays.toString(courses));
    }
}

// Main class to test the program
public class EX7 {
    public static void main(String[] args) {
        String[] courses = {"Toan", "Ly", "Anh"}; // Creating a Teacher object
        Teacher teacher;
        teacher = new Teacher("Vo Van Khanh", 18, "1888 Earth", "Truong Viet-Han", courses);
        System.out.println("Teacher Information:"); // Displaying teacher information
        teacher.displayTeacherInfo();
    }
}
