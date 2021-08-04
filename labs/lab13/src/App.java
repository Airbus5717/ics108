import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        final File file = new File("IDsWithDuplicates.txt");
        if (file.exists()) {
            Scanner fileContents = new Scanner(file);
            while (fileContents.hasNextLine()) {
                int tmp = Integer.parseInt(fileContents.nextLine());
                if (!arrayList.contains(tmp)) {
                    arrayList.add(tmp);
                }
            }
            fileContents.close();
        } else {
            throw new FileNotFoundException(file.toString() + " Does not exist");
        }

        File fileOut = new File("IDWithoutDuplicates.txt");
        PrintWriter output = new PrintWriter(fileOut);
        for (Integer integer : arrayList) {
            output.println(integer);
        }
        output.close();
    }
}
