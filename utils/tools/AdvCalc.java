package utils.tools; 



public class AdvCalc extends Calculator { // sub class
    public int mul(int i, int j) {
        return i * j;
    }

    public int div(int i, int j) {
        return i / j;
    }

    public void show() {
        System.out.println("Inside AdvanceCalc class");
    }
}