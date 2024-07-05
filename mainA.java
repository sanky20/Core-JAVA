import others.A;

class C extends A {
    public void print() {
        System.out.println(marks4);
    }
}

public class mainA {
    public static void main(String[] args) {
        A obj = new A();

        // System.out.println(obj.marks); // not visible as it is default access
        // modifier

        System.out.println(obj.marks2); // accessible as it is public access modifier

        
        A2 obj2 = new A2();

        System.out.println(obj2.m1); // accessible as it is default access modifier

        System.out.println(obj2.m4);

        C obj3 = new C();
        obj3.print();

    }
}
