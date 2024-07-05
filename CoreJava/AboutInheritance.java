import utils.tools.AdvanceCalc;

class Calc { // super class
    public int add(int i, int j) {
        return i + j;
    }

    public int sub(int i, int j) {
        return i - j;
    }
    public void show(){
        System.out.println("Inside Calc class");
    }
}

class AdvanceCalc extends Calc { // sub class
    public int mul(int i, int j) {
        return i * j;
    }

    public int div(int i, int j) {
        return i / j;
    }
    public void show(){
        System.out.println("Inside AdvanceCalc class");
    }
}

class ScientificCalculator extends AdvanceCalc {
    public double power(int i, int j) {
        return Math.pow(i, j);
    }
}

public class AboutInheritance {
    public static void main(String[] args) {

        AdvanceCalc c1 = new AdvanceCalc();
        System.out.println("Advance Calculator:");
        System.out.println(c1.add(5, 4));
        System.out.println(c1.sub(5, 4));
        System.out.println(c1.mul(5, 4));
        System.out.println(c1.div(15, 4));

        // Inheritance is a mechanism in a class acquires all the properties and
        // behaviors of a parent class.

        // Inheritance represents the IS-A relationship which is also known as a
        // parent-child relationship.

        // Inheritance is a way to reuse code of existing classes, and it is used to establish a relationship between two classes.

//............

        ScientificCalculator c2 = new ScientificCalculator();  // multilevel inheritance
        System.out.println("Scientific Calculator:");

        System.out.println(c2.add(5, 4));
        System.out.println(c2.sub(5, 4));
        System.out.println(c2.mul(5, 4));
        System.out.println(c2.div(15, 4));
        System.out.println(c2.power(2, 3));

        // multilevel inheritance: A class extends another class which is also extended by another class.
        // In the above example, ScientificCalculator extends AdvanceCalc which extends Calc class.

        c2.show();   // OUTPUT->  Inside AdvanceCalc class.

        // c2 will first search in its parent class(AdvanceCalc) for the show() method.
        // If the show() method is not found in the parent class, then it will search in the grandparent class(Calc) for the show() method.
        

        // In the above example, the show() method is present in both the Calc and AdvanceCalc class.
        // The show() method is overridden in the AdvanceCalc class.
        // So, the show() method of the AdvanceCalc class is called.




    }

}
