package Activity9;

public class Student {

    // declaration of empty variables - field type defer by the instruction.
     public String name;                            // set to public.
     private int age;                               // set to private.
     protected String course;                       // set to protected.
     String studentID;                              // no specific field assignment.

    // declared that Student is public so it can be accessed by Activity9_Matiga.
    public Student (String name, int age, String course, String studentID) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentID =studentID;
    }

    // used getter and setter to access the private age variable.
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // used getter and setter to access the protected course variable.
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // used getter and setter to access the default studentID variable.
    public  String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
