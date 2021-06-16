
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter milliseconds: ");
        long millis = input.nextLong();
        input.close();
        System.out.println(convertMillis(millis));
    }
    public static String convertMillis(long millis) {
        long sec = millis / 1000;
        long seconds = sec % 60;
        long minutes = sec / 60;
        if (minutes >= 60) {
            long hours = minutes / 60;
            minutes %= 60;
            return millis + " milliseconds = " + hours + ":" + (minutes < 10 ? "0" + minutes : minutes) + ":" + (seconds < 10 ? "0" + seconds : seconds);
        }
        return millis + " milliseconds = "+ "00" + ":" + minutes + ":" + (seconds < 10 ? "0" + seconds : seconds);
    }

}
