/*
    The Fraction class.
    The base calculations for the fractions are defined here.
*/

import java.util.InputMismatchException;

public class Fraction {
    private long numerator;
    private long denominator;

    public Fraction(String input) throws InputMismatchException, NumberFormatException, ArithmeticException {
        ParseInput parsedInput = new ParseInput(input); // Checking if the input is valid.
        this.denominator = parsedInput.getDown();
        this.numerator = parsedInput.getTop();
        reduceFraction();
    }

    private Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduceFraction();
    }

    // calculates the GCD for each fraction to make it in the simplest form possible
    private static long greatCommonDenominator(long n, long d) {
        long num1 = Math.abs(n);
        long num2 = Math.abs(d);
        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    // The base code for calculating the arithmetic operations.
    public Fraction addFraction(Fraction other) {
        long n = numerator * other.getDenominator() + denominator * other.getNumerator();
        long d = denominator * other.getDenominator();
        return new Fraction(n, d);
    }

    public Fraction subtractFraction(Fraction other) {
        long n = numerator * other.getDenominator() - denominator * other.getNumerator();
        long d = denominator * other.getDenominator();
        return new Fraction(n, d);
    }

    public Fraction multiplyFraction(Fraction other) {
        long n = numerator * other.getNumerator();
        long d = denominator * other.getDenominator();
        return new Fraction(n, d);
    }

    public Fraction divideFraction(Fraction other) throws ArithmeticException {
        long n = numerator * other.getDenominator();
        long d = denominator * other.getNumerator();
        if (d == 0) {
            throw new ArithmeticException("Divide by Zero error");
        }
        return new Fraction(n, d);
    }

    public void reduceFraction() {
        long gcd = greatCommonDenominator(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    @Override // Override toString()
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else if (numerator == 0)
            return "0";
        else
            return numerator + "/" + denominator;
    }
}
