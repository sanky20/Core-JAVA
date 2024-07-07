public class AutoBoxingandUnboxing {

    // autoboxing -> converting primitive data type to object

    public static void main(String[] args) {
        int n= 5;
        Integer i= n; // autoboxing

        System.out.println(i);

        // unboxing -> converting object to primitive data type

        int j= i; // unboxing

        System.out.println(j);


        String x= "15";

        int y=  Integer.parseInt(x); // converting string to int

        System.out.println(y+5);  //20
    }
}
