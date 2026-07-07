// import the student in the Activity9 Package to access it.
import Activity9.Student;

public class Activity9_Matiga {
    public static void main(String[] args) {

        // creating student object to declares the variables.
        Student student = new Student("John Michael", 18, "BSIT", "25-1234");

        // using the setter to update age from 18 to 19, since age is private and can't be changed directly.
        student.setAge(19);

        // display the output - accessing the public and private infos.
        System.out.println("==== Display Student Information ====");
        System.out.println("Student Name: " + student.name); // can be easily accessed because it's set to public field.
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Course: " + student.getCourse());
        System.out.println("Student ID: " + student.getStudentID());
    }
}