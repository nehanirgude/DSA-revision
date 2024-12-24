public class Multilevelinheritance {

    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.legs = 4;
        dobby.eat();

    }

}

// syntax
class Animal {

    String color;

    void breath() {
        System.out.println("can breath");
    }

    void eat() {
        System.out.println("can eat");
    }
}

class Mammal extends Animal {
    int legs;

}

class Dog extends Mammal {
    String breeds;

}