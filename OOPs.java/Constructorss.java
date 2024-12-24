public class Constructorss {

    public static void main(String args[]) {
        // java make default constructor only if there is not a single constructor is
        // made

        Student s1 = new Student(); // contructor is called

        Student s2 = new Student("neha"); // constructor call for parameterized constructor

    }
}

class Student {

    int marks;
    String name;

    // if we dont make any contructor still java make a default custructor
    Student() {
        System.out.println("constructer is called");

    }
    // parameterized constructor

    Student(String name) { // parameter is passed during defination is called parameterized constructor

        this.name = name;
    }
}
