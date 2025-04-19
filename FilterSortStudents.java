import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class FilterSortStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Emma", 85),
            new Student("Liam", 72),
            new Student("Olivia", 90),
            new Student("Noah", 78)
        );

        students.stream()
            .filter(s -> s.marks > 75)
            .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
            .map(s -> s.name)
            .forEach(System.out::println);
    }
}
