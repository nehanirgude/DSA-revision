public class hierachialinheritance {
    public static void main(String args[]) {
        Fish f1 = new Fish();
        f1.eat();
    }

}

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

class Fish extends Animal {
    void swim() {
        System.out.println("can swim");
    }
}
