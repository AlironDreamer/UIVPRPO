package org.calc;

public class Calc {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return Math.round(a / b);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Корень из отрицательного числа недопустим.");
        }
        return Math.sqrt(a);
    }

    public double abs(double a) {
        return Math.abs(a);
    }
}