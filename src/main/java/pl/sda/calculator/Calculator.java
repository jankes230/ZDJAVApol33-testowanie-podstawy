package pl.sda.calculator;

public class Calculator {

    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public boolean isDividableByThree(int arg) {
        return (arg % 3) == 0;
    }

    public int substract(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public double division(double arg1, double arg2) {
        if(arg1 == 0 || arg2 ==0){
            return 0;
        }
        double wynik = (double)(arg1/(arg2));
        return wynik;

    }

    public boolean isEvenNumber(int arg) {
        return (arg % 2) == 0;
    }

    public boolean isNotEvenNumber(int arg) {
        return (arg % 2) != 0;
    }

    public double percentOfnumber(int arg, double percet) {
        return arg * percet;
    }
}
