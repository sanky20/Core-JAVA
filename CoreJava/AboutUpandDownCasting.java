class X {
    public void show1() {
        System.out.println("In X");
    }

}

class Y extends X {
    public void show2() {
        System.out.println("In Y");
    }

}

public class AboutUpandDownCasting {
    public static void main(String[] args) {

        X obj = new Y();  // upcasting

        obj.show1();
        // obj.show2(); // error: cannot find symbol

        Y obj2= (Y)obj ;  // downcasting

        obj2.show2();


    }

}
