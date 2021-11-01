import java.util.*;
public class Main {
    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nСтуденти " + course + " курсу:");
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }


    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Anna"));
        list.add(new Student(2, "Maria"));
        list.add(new Student(3, "Lia"));
        list.add(new Student(4, "David"));
        list.add(new Student(1, "Ted"));

        int c = 1;
        printStudents(list, c);

        c = 2;
        printStudents(list, c);

        c = 3;
        printStudents(list, c);

        c = 4;
        printStudents(list, c);
    }


}
