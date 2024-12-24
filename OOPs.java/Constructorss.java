public class Constructorss {

    public static void main(String args[]) {

        Student s1 = new Student(); // contructor is called

    }
}

class Student {

    int marks;
    String name;

    // if we dont make any contructor still java make a default custructor
    Student() {
        System.out.println("constructer is called");
    }

}
