/**
 * @author : airbus5717
 * @created : 2021-06-12
**/

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String strInput = input.next().toUpperCase();
        char letter = strInput.charAt(0);
        char sign = ' '; double grade = 0.0; boolean unknown = false;

        if (strInput.length() > 1)
            sign = strInput.charAt(1);
        if (sign == '+' && letter != 'A') {
            grade = 0.5;
        } else if (letter == 'A' && sign == '+') {
            grade = 0.25;
        }
        switch (letter) {
            case 'A' : grade += 3.75; break;
            case 'B' : grade += 3.0; break;
            case 'C' : grade += 2.0; break;
            case 'D' : grade += 1.0; break;
            case 'F' : grade = 0.0; break;
            default : unknown = true; break;
        }
        if (!unknown)
            System.out.println("The quality points: " + grade);
        else
            System.out.println("invalid grade");
    }
}

