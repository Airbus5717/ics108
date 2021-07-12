import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Item[] store = new Item[3];
        store[0] = new Item();
        store[0].setName("Milk");
        store[0].setPrice(4.5);
        store[0].setId(11);

        store[1] = new Item("Juice", 12, 3.5);
        store[2] = new Item("Water", 13, 1.0);

        Arrays.stream(store).forEach(e -> e.updatePrice(15));

        /// WRITING PHASE
        // write to txt
        File file = new File("items.txt");
        PrintWriter printWriter = new PrintWriter(file);
        Arrays.stream(store).forEach(e -> printWriter.println(e));

        // free from memory
        printWriter.close();

        // write to .dat files
        writeObjects("items.dat", store);

        /// PRINTING PHASE
        // print first array
        Arrays.stream(store).forEach(e -> System.out.println(e));

        // read txt file
        System.out.println("Reading from txt file.");
        Scanner scanner = new Scanner(new File("items.txt"));
        ArrayList<String> store2 = new ArrayList<String>();
        while (scanner.hasNext()) {
            store2.add(scanner.nextLine());
        }
        scanner.close();
        // print the txt file
        store2.forEach(e -> System.out.println(e));
        store2.clear();

        // read and print from .dat files
        try {
            System.out.println("Reading from .dat file.");
            Item[] store3 = readObjects("items.dat", store.length);
            Arrays.stream(store3).forEach(e -> System.out.println(e));
        } catch (ClassNotFoundException err) {
            System.err.println(err);
        }
    }

    // write Objects array to .dat files
    private static void writeObjects(String filename, Object[] obj) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(filename));
            o.writeObject(obj);
            o.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    // read objects from .dat files and return an array of objects
    private static Item[] readObjects(String filename, int number) throws ClassNotFoundException {
        Item[] itemArray = new Item[number];
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(filename));
            itemArray = (Item[]) o.readObject();
            o.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        return itemArray;
    }
}
