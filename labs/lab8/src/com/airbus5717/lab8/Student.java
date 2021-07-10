import java.util.Date;

public abstract class Student implements Cloneable, Comparable<Student> {
    private int id;
    private String name;
    private Date birthDate;
    private double gpa;

    public Student(int id, String name, Date birthDate, double gpa) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gpa = gpa;
    }

    abstract public String getStatus();

    @Override
    public String toString() {
        return "Student " + "id = " + id + ", name = '" + name + '\'' + ", birthDate = " + birthDate + ", gpa = "
                + gpa;
    }

    @Override
    public int compareTo(Student o1) {
        // minus one is written for descending order
        return -1 * Double.compare(this.gpa, o1.gpa);
    }

    @Override
    public Student clone() {
        try {
            Student student = (Student) super.clone();
            student.birthDate = (Date) birthDate.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Date getBirthDay() {
        return birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setBirthDay(Date birthDate) {
        this.birthDate = birthDate;
    }
}
