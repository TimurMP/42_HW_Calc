package telran.calculator.dao;

public class Calculator implements Calculable {


    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double divide(double a, double b) {
        return 0;
    }

    @Override
    public double multiply(double a, double b) {
        return 0;
    }

    @Override
    public double squareRoot(double a, double b) {
        return 0;
    }

    @Override
    public double someComplexMathOperation(double a, double b) {
        return 0;
    }



}
