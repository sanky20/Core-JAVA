public class AboutFinalKeyword {
    public static void main(String[] args) {
        // final keyword is used to restrict the user from changing the value of a variable,method or class


        final int i = 10;
        // i = 20; // error: cannot assign a value to final variable i
        System.out.println(i);

        /* Final variable -> we cant change its value */
        /* Final Class -> inheritance is stopped ...it can't be inherited by any class */
        /* Final Method -> method can't be overridden by any child class */

    }
}
