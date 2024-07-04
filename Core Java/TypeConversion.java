public class TypeConversion {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        byte a = 115;
        int b = 1255;

        // b=a; // implicit conversion
        // System.out.println(b);

        // a=b; // error because byte is smaller than int ( even if the value of "b" is
        // smaller)
        // System.out.println(a);
        // but if the value of "b" is smaller than the maximum value of byte, then it
        // may work if we use explicit conversion

        // example

        byte x = 114;

        int y = 166;

        x = (byte) y; // explicit conversion (casting)

        // System.out.println(x);
        // .............................................

        float p= 5.6f;
        // int q=p;  // error ( implicit conversion is not possible from float to int)

        int q= (int) p;

        // System.out.println(q);


        int l= 71;

        float m= l;  // implicit conversion is allowed from int to float

        // System.out.println(m);

        //...

        char ch= 'a';
        int num= ch; 
        
        // implicit conversion is allowed from char to int ( possible when we move lower to higher data type like char to int, int to long, float to double ...but it is not possible from higher to lower data type like int to char, long to int, double to float... for that we have to do explicit conversion (casting)

        // System.out.println(num);

        int num2= 107;
        // char ch2= num2; // error ( implicit conversion is not possible from int to char)

       char ch2= (char) num2; // explicit conversion (casting)

        //  System.out.println(ch2);



        byte x1=15;
        int x2= 118;

        x1= (byte) x2;  // explicit conversion (casting)
        System.out.println("x1 :"+x1);


       



         


        

    }

}
