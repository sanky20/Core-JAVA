package others;

public class A {

    int marks=6;  // cant be access in mainA.java as it is default access modifier // can only be access in the same package
    // since mainA.java and A.java are in different packages, this variable is not accessible in mainA.java

    public int marks2= 8;  // can be access in mainA.java as it is public access modifier (it can be access from any class in same package or different package)

    private int marks3= 10; // cant be access in mainA.java as it is private access modifier // can only be access in the same class

    protected int marks4= 12; // can't be access in mainA.java as it is prottected 









    
}
