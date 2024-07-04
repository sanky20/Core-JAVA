class Dog{
    String name ;
    int age;
    static String breed;

    public Dog(){  /// constructor
        age=5;
        name="Roxy";

        System.out.println("inside constructor");
    }

    static {  // static block
        breed = "Desi";
        System.out.println("inside static block");
    }
    
}


public class AboutStaticBLock {
    public static void main(String[] args) {

        Dog d1= new Dog();
        Dog d2= new Dog();
        
        // static block is executed only once at the time of class loading
        // static block is used to initialize the static variables
        // static block is executed before the constructor

        // creation of object takes place in 2 steps => Class Loading and then object instantiation

        // since class loading is happening first and only once ..that's why -> static block is executed first and only once

        
    }
    
}
