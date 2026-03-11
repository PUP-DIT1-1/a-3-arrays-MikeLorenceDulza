import java.util.Scanner;

public class grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] students = new String[10];
        double[] grades = new double[10];

  
        System.out.println("Enter 10 student names and their grades:");

        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + " name: ");
            students[i] = scan.nextLine();

            System.out.print("Grade of " + students[i] + ": ");
            grades[i] = scan.nextDouble();
            scan.nextLine();
        }

       
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double average = sum / grades.length;

        System.out.println("Average Grade: " + average);

  
        for (int i = 0; i < grades.length - 1; i++) {
            for (int j = 0; j < grades.length - i - 1; j++) {

                if (grades[j] > grades[j + 1]) {

                    
                    double tempGrade = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = tempGrade;

                  
                    String tempName = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tempName;
                }
            }
        }

        System.out.println("Students Sorted by Grades (Ascending):");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + grades[i]);
        }

        // SEARCH FOR STUDENT
        System.out.print("Enter student name to search: ");
        String searchName = scan.nextLine();

        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(searchName)) {
                System.out.println("Student found: " + students[i] + " - Grade: " + grades[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        scan.close();
    }
}
