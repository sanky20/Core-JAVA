package utils.advancetools;  // means this class is inside the utils package

import utils.tools.AdvCalc; // importing the AdvCalc class from the tools package

public class SciCalc extends AdvCalc {
    public double power(int i, int j) {
        return Math.pow(i, j);
    }
    public void show() {
        System.out.println("Inside Scientific class");
    }
}