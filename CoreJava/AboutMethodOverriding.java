class A {

    public void show() {
        System.out.println(" inside A");
    }

}

class B extends A {

    public void show() {
        System.out.println(" inside B");
    }

}

public class AboutMethodOverriding {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();

        // Method overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
        // When a method in a subclass has the same name, same parameters or signature and same return type as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
        // The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed.
    }

}
