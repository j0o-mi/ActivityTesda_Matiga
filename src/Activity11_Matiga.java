// Parent Class
class Person {
    protected String name;
    protected int age;

    // Constructor - to access the variables
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display Method - Used to display the name and age.
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student Class is created - extends keyword is used to inherits the values of the Parent class (Person).
class Student extends Person {
    protected String course;

    // Constructor for Student - for course.
    // super(); is used to access the name and age println.
    public Student  (String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    // Display Method is yet again used, to display the student infos.
    // used of @Override to access the existing method and add/change something in it.
    // super.displayInfo() reuses the parent's displayInfo() to print name and age
    @Override
    public void displayInfo() {
        System.out.println("========= Student Info =========");
        super.displayInfo();
        System.out.println("Course: " + course);
    }
}

// main class
public class Activity11_Matiga {
    //  main method
    public static void main(String[] args) {
        // creating student object
        Student student = new Student("John Michael", 18, "BS Information Technology");

        // display the output with new values
        student.displayInfo();
    }
}