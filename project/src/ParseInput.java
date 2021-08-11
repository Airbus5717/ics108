/*
    ParseInput class.
    This class is used to check if the input in the correct form,
    i.e., the input can be a fraction or an integer.
*/

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class ParseInput {
    private long top;
    private long down;

    public ParseInput(String input) throws InputMismatchException, NumberFormatException, ArithmeticException {
        String[] fractionArr = input.split("/"); // splitting the numerator and denominator.
        if (Pattern.matches("[0-9]+[\\.]?[0-9]*", input)) { // used regex to get if the string is only numbers.
            top = Long.parseLong(input);
            down = 1;
        } else if (fractionArr.length != 2) {
            throw new InputMismatchException("Wrong Input. Input must be a fraction");
        } else {
            top = Long.parseLong(fractionArr[0]); // if the fraction includes characters other than numbers,
            down = Long.parseLong(fractionArr[1]); // these two statements will throw NumberFormatException.
        }
        if (down == 0) {
            throw new ArithmeticException("Divide by Zero error");
        }
    }

    public long getTop() {
        return top;
    }

    public long getDown() {
        return down;
    }
}
