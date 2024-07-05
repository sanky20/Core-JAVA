class A{
    public A(){
        super();
        System.out.println("Inside A class constructor");
    }
    public A(int i){
        System.out.println("Inside A class constructor with value of i as "+i); // this is a parameterized constructor
}
}

class B extends A{
    public B(){
        super(); // super() is used to call the constructor of the parent class
        System.out.println("Inside B class constructor");
    }
    
    public B(int i){
        super(i); // super() is used to call the constructor of the parent class

        
        System.out.println("Inside B class constructor with value of i as "+i);
    }
}
class C extends A{
    public C(){
        super(); // super() is used to call the constructor of the parent class
        System.out.println("Inside C class constructor");
    }
    
    public C(int i){
        this(); // it will call the default constructor of the same class
        
        System.out.println("Inside C class constructor with value of i as "+i);
    }
}


public class ThisandSuperMethod {
    public static void main(String[] args) {

        // B obj= new B();

        // B obj2= new B(5);

        // super() is used to call the constructor of the parent class
        // this() is used to call the constructor of the same class
        // super() is hidden in the code, it is not visible to the programmer.
        // we can even avoid writing it ..but still it is there.
        // super() is always the first statement in the constructor.


        C obj3= new C();
        C obj4= new C(10);

    }

}

