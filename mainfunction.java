// import  utils.tools.AdvCalc;
// import utils.tools.Calculator;
 
import utils.tools.*;  // importing all the classes from the tools package
import utils.advancetools.SciCalc;  // importing the SciCalc class from the advancetools package



public class mainfunction {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.show();

        System.out.println(obj.add(10, 20));

        AdvCalc obj1 = new AdvCalc();

        obj1.show();

        System.out.println(obj1.div(20, 2));

        SciCalc obj2 = new SciCalc();

        obj2.show();
    }
    
}
