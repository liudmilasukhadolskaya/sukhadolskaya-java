package by.itacademy.sukhadolskaya;

public class Calculator implements ICalculator {
    @Override
    public int sum(int a, int b) {
        try {
            return Math.addExact(a, b);
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    @Override
    public int multiply(int a, int b) {
        try {
            return Math.multiplyExact(a, b);
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            return 0.0;
        }
        return (double) a / b;
    }

    @Override
    public int subtract(int a, int b) {
        try {
            return Math.subtractExact(a, b);
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
