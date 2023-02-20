import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1L;
        student.subject = "Maths";
        student.marks = 90;

        Student student1 = new Student();
        student1.id = 1L;
        student1.subject = "Science";
        student1.marks = 80;

        Student student2 = new Student();
        student2.id = 1L;
        student2.subject = "SST";
        student2.marks = 89;

        Student student3 = new Student();
        student3.id = 2L;
        student3.subject = "Science";
        student3.marks = 50;

        Student student4 = new Student();
        student4.id = 4L;
        student4.subject = "Science";
        student4.marks = 60;

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.stream().map(student5 -> student5.subject).sorted().collect(Collectors.toList());

        Map<Long, List<Student>> map = students.stream().collect(Collectors.groupingBy(student5 -> student5.id, HashMap::new, Collectors.toCollection(ArrayList::new)));
        System.out.println();

    }
}
