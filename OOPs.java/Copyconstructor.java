public class Copyconstructor {

    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "neha";
        s1.rollNo = 34;
        s1.marks = 70;

        Student s2 = new Student(s1);
    }

}

class Student {

    String name;
    int rollNo;
    int marks;

    Student() {
        System.out.println("constructor called");
    }

    // copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }

}