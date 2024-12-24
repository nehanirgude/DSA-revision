public class Classesobj {
    public static void main(String args[]) {

        // object declaration

        Pen p1 = new Pen(); // we have created pen obj called p1
        p1.setColor("blue");
        System.out.println(p1.color);

        // p1.setTip(5);
        // System.out.println(p1.tip);

    }

}

// class to store pen properties

// syntax of writing a class

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void SetTip(int newTip) {
        tip = newTip;

    }
}

// bluprint for student obj -class

class Student {
    int phy;
    int math;
    int eng;
    int percentage;

    void avgPercentage(int phy, int math, int eng) {
        percentage = (phy + math + eng) / 3;
    }
}