public class ConditionalsAndLoop {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // if-else
        // int a=15;
        // if(a%2==0)
        // {
        // System.out.println("Even");
        // }
        // else
        // {
        // System.out.println("Odd");
        // }

        // ................................................................

        // if-else-if ladder

        int a=10;
        if(a>0)
        {
        System.out.println("Positive");
        }
        else if(a<0)
        {
        System.out.println("Negative");
        }
        else
        {
        System.out.println("Zero");
        }

        // ................................................................

        // Switch-case statement

        // int a = 4;

        // switch (a) {
        // case 1:
        // System.out.println("Sunday");
        // break;
        // case 2:
        // System.out.println("Monday");
        // break;
        // case 3:
        // System.out.println("Tuesday");
        // break;
        // case 4:
        // System.out.println("Wednesday");
        // break;
        // case 5:
        // System.out.println("Thursday");
        // break;
        // case 6:
        // System.out.println("Friday");
        // break;
        // case 7:
        // System.out.println("Saturday");
        // break;
        // default:
        // System.out.println("Invalid");
        // }

        String str = "Sunday";

        switch (str) {
            case "Sunday", "Saturday" -> {
                System.out.println("Weekend :)");
                System.out.println("10am");

            }
            case "Monday", "Friday" -> {
                System.out.println("Working day :( ");
                System.out.println("7am");
            }

            default -> System.out.println("Not a valid day");
        }

        //..........

        String result;

        switch(str)
        {
            case "Sunday", "Saturday" -> result="Weekend :)";
            case "Monday", "Friday" -> result="Working day :(";
            default -> result="Not a valid day";
        }

        System.out.println(result);

        //........

        String ans="";
        ans= switch(str)
        {
            case "Sunday", "Saturday" -> "Weekend :)";
            case "Monday", "Friday" -> "Working day :(";
            default -> "Not a valid day";
        };

        System.out.println(ans);

        String res="";
        res= switch(str)
        {
            case "Sunday", "Saturday" : yield "Weekend :)";
            case "Monday", "Friday" : yield "Working day :(";
            default : yield "Not a valid day";
        };

        System.out.println(res);




    }

}
