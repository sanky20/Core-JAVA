class Calculator{
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, int b)
    {
        return a+b;
    }
    public int add(int a,int b, int c)
    {
        return a+b+c;
    
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        int num1=5;
        int num2=4;
        int num3=10;
        double num4=5.6;

        Calculator calc= new Calculator();

        int res1= calc.add(num1, num2);

        System.out.println("The sum of two number is: "+res1);

        int res2= calc.add(num1,num2,num3);

        System.out.println("The sum of three number is: "+res2);

        double res3= calc.add(num4,num3);

        System.out.println("The sum of double and integer is: "+res3);

    }
    
}
