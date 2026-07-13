import java.util.Scanner;

public class Activity6_Matiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Problem Scenario:
        You are creating a program to store and display the scores of 5 students in a quiz. The program should:
        1. Store all scores in an array.
        2. Calculate the total score and average score.
        3. Display all scores entered.
        4. Display the highest score among all students.
         */

        // declaration of variables and array
        int studentCount = 5;                           // counts of students in the array (limit the student to 5)
        double[] grades = new double[studentCount];     // the array the holds the students grade
        double totalGrade = 0;
        double highestGrade = 0;
        double averageGrade = 0;

        // for loop - used to ask the user what is the grade of the student.
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter score for Student " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();

            totalGrade += grades[i];                                // adding every grade to the array to get the total grade.

            averageGrade = totalGrade / studentCount;               // total grade divides to student count to get the average.

            if (grades[i] > highestGrade) {                         // check for highest grade in the list.
                highestGrade = grades[i];
            }
        }

        // display the entered grade per student using for loop.
        System.out.println("\n--- Grade Report ---");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student " + (i + 1) + ": " + grades[i]);
        }

        // display the calculations.
        System.out.printf("\nTotal Score: %.2f" , totalGrade);
        System.out.printf("\nAverage Score: %.2f" , averageGrade);
        System.out.printf("\nHighest Score: %.2f" , highestGrade);

        sc.close();
    }
}