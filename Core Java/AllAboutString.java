public class AllAboutString {
    public static void main(String[] args) {

        // string is not a primitive data typee ...it is a class

        // String str = new String("Sanskar");

        // str= "Hello " + str;

        // System.out.println(str);
        // System.out.println(str.hashCode());
        // System.out.println(str.toUpperCase());

        // String is so common and widely used thats why we can directly use without
        // creating its object ..( these things will happen behind the scenes )

        // String s = "Sanskar";
        // internal implementation -> String s= new String("Sanskar");

        // System.out.println(s);
        // System.out.println(s.length());

        // normally , String is Immutable 

        // In order to create mutable string ...we can use String Buffer or String Builder

        // String Buffer ................

        StringBuffer sb= new StringBuffer("Sanskar");

        System.out.println(sb.capacity());  
        // capacity-> 16 + 7 (length of string)= 23 !!!

        System.out.println(sb.length());
        // length-> 7

        sb.append(" Sharma");
        System.out.println(sb);

        // String str= sb; // error-> cannot convert from mutuable(StringBuffer) to immutable(String)

        // String str= sb.toString();   // works fine

        // System.out.println(str);

        

    





    }
}
