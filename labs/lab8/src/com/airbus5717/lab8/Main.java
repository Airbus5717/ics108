
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new UnderGraduate(1, "Ali", new Date(2000, 12, 12), 2.0));
        arrayList.add(new Graduate(2, "bruh", new Date(2000, 12, 12), 3.0));
        arrayList.add(new UnderGraduate(2, "test", new Date(2000, 12, 12), 4.0));

        System.out.println("");
        System.out.println("before sorting");
        for (Student student : arrayList) {
            System.out.println(student);
        }

        Collections.sort(arrayList);
            
        // another possible solution
        // list.sort(Comparator.comparing(Student::getGpa));

        System.out.println("after sorting");
        for (Student student : arrayList) {
            System.out.println(student);
        }
        System.out.println("");
    }

}
