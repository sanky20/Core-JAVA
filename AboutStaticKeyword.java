class Dog {
    String name; // instance variables
    static String breed; // static variables
    int age; // instance variables

    public void show() {  // instance methods

        // local variables are those which are declared inside a method
        System.out.println(name + " : " + breed + " : " + age);
    }

    public static void show2(Dog obj){ // static method
         System.out.println("inside static method");
         System.out.println(obj.name + " : " + breed + " : " + obj.age);
         
    }


}

public class AboutStaticKeyword {

    public static void main(String[] args) {

        // main function is static because it is called by the JVM and we don't want to create an object of the class to call the main function 
        

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "Roxy";
        d1.breed = "Desi";
        d1.age = 12;

        d2.name = "Risky";
        d2.breed = "Desi";
        d2.age = 7;

        // warning -> the static field Dog.breed should be accessed in a static way

        // what is static ?...
        // static is a keyword in java used to create class level variables and methods
        // static variables are shared among all the objects of the class
        // static variables are initialized only once at the start of the execution
        // static variables are stored in the class area, not in the heap area
        // static variables are created at the time of class loading
        // static variables can be accessed directly with the class name and dot operator

        d1.show();
        d2.show();

        d1.breed = "Desi kutta"; // on changing the value of static variable breed, it will change for all the  objects of the class

        d1.show();
        d2.show();

        // we can access static variables with the class name and dot operator

        Dog.breed = "German Shehphard";

        d1.show();
        d2.show();

        //  Dog.show(); 
        // error -> non-static method show() cannot be called using class name
       
//................................................................

        // static methods can be called using class name and dot operator

        // s2.show2();  // error
         // we can't access static method directly with the object of the class
        // because -> static methods are class level methods and they are not associated with any object of the class

        Dog.show2(d2);  // in order to access instance variable name and age, we need to pass the object of the class

        // static methods can access only static variables directly
        // static methods can access instance variables only through objects
        











    }
}
