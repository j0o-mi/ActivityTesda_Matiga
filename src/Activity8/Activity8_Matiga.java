package Activity8;
import java.util.Scanner;

public class Activity8_Matiga {

    static class Student {
         String name;
         int age;
         String course;

         Student() {
             name = "Unknown";
             age = 0;
             course = "Unknown";
         }

        Student (String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        void display (int studentCount) {
            System.out.println("\nStudent " + studentCount + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Course: ");
        String course = sc.nextLine();

        Student student2 = new Student(name, age, course);

        student1.display(1);
        student2.display(2);

        sc.close();

    }
}
