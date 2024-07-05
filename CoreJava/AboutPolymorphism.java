class A {
    public void show() {
        System.out.println("In A");
    }
}

class B extends A{

    public void show() {
        System.out.println("In B");
    }
    public void find() {
        System.out.println("In B find");
    }

}

public class AboutPolymorphism {
    public static void main(String[] args) {

        A obj = new A(); 
        obj.show(); // output-> in A

        obj= new B(); 

        obj.show(); // output-> in B

        // dynamic method dispatch -> 
        // when a parent reference variable refers to a child object

  
        
        


        




    }

}
