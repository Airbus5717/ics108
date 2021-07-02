import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] myArray = new int[4][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.println("before");
        printArray2D(myArray);
        System.out.println("after");
        int[][] newArray = sortRows(myArray);
        printArray2D(newArray);
    }

    public static int[][] sortRows(int[][] n) {
        int[][] m = new int[n.length][n[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                m[i][k] = n[i][k];
            }
            Arrays.sort(m[i]);
        }
        return m;
    }

    public static void printArray2D(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
