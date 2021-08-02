import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Files in lib dir: " + countFiles(new File("./lib/")));
    }

    public static int countFiles(File f) {
        int i = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                i += countFiles(file);
            } else {
                ++i;
            }
        }
        return i;
    }
}
