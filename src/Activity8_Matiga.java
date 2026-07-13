import java.util.Scanner;

public class Activity8_Matiga {

    // Student Class - use of constructor to initialized objects/values.
    static class Student {
         String name;
         int age;
         String course;

         // default constructor.
        // fixed default value so the object will not be 'empty'.
         Student() {
             name = "Unknown";
             age = 0;
             course = "Unknown";
         }

         // parameterized constructor - accept arguments and uses them to initialize the fields.
        Student (String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        // displays the details of the student object.
        // the value that will appear depends on the constructor used.
        void display (int studentCount) {
            System.out.println("\nStudent " + studentCount + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating an object using default constructor.
        // student 1 will use the default values of the constructors.
        Student student1 = new Student();

        // collecting real data for the 2nd Student.
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();

        // creating an object using parameterized constructor.
        // Student 2 will use the data the user inputted.
        Student student2 = new Student(name, age, course);

        // calls out display method to print the values of the students.
        student1.display(1);    // student 1 will use the default/fixed constructor by default.
        student2.display( 2);    // student 2 will use the values by the parameterized constructor..

        sc.close();

    }
}
