public class Inheritance {

    public static void main(String args[]) {

        Fish shark = new Fish();
        shark.eat(); // eat function not present in fish class but still it can access from base
                     // class
    }

}

// base class
class Animal {
    String color;

    void breath() {
        System.out.println("can breath");
    }

    void eat() {
        System.out.println("can eat");
    }
}

// derived class
// we use extends keyword to copy all properties from base class to dervived
// class

class Fish extends Animal {
    int fins;

    void swims() {
        System.out.println("can swim");
    }

}