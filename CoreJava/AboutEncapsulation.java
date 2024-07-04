class Human {
    private String name;
    private int age;

    // Encapsulation -> binding the data with the methods that manipulate the data
    
    public void setName(String name) {
        this.name = name;

        // this -> refers to the current object 
        // this.name -> refers to the instance variable
        // name -> refers to the local variable
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

public class AboutEncapsulation {
    public static void main(String[] args) {

        Human h1 = new Human();

        // h1.name="Sanskar";
        // h1.age= 23;
        // error-> name has private access in Human
        // error-> age has private access in Human
        // why error-> bcoz they cant be accessed directly from outside the class

        h1.setName("Sanskar");
        h1.setAge(23);

        System.out.println(h1.getName() + " : " + h1.getAge());

        Human h2 = new Human();

        h2.setName("Sahil");
        h2.setAge(24);

        System.out.println(h2.getName() + " : " + h2.getAge());

    }
}
