class Human {
    String name;
    int age;

    public Human() { // default constructor
        System.out.println("Default Constructor called");
        name = "Sanskar";
        age = 23;
    }

    public Human(String name, int age) { // parameterized constructor
        System.out.println("Parametrized Constructor called");
        this.name = name;
        this.age = age;

    }
}

public class AboutConstructor {

    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human("Anmol", 22);

        System.out.println(h1.name + " : " + h1.age);
        System.out.println(h2.name + " : " + h2.age);
    }

}
