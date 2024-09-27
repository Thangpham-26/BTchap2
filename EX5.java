import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student information
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student age: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter student address: ");
        String address = scanner.nextLine();

        // Input number of subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];

        // Input marks for each subject
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average marks
        double averageMarks = (double) totalMarks / numSubjects;

        // Display student information and average marks
        System.out.println("\nStudent Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + String.format("%.2f", averageMarks));
    }
}