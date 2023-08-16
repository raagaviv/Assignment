import java.util.*;

class Subject {
    private String name;
    private int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public int getTotalMarks() {
        int totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        return totalMarks;
    }

    public String getName() {
        return name;
    }
}

class RankCalculator {
    public List<Student> calculateRanks(List<Student> students) {
        List<Student> rankedStudents = new ArrayList<>(students);
        rankedStudents.sort(Comparator.comparingInt(Student::getTotalMarks).reversed());
        return rankedStudents;
    }
}

public class StudentRankingExample {
    public static void main(String[] args) {
        // Create subjects and students
        Subject math = new Subject("Math", 90);
        Subject science = new Subject("Science", 85);
        Subject english = new Subject("English", 78);

        List<Subject> student1Subjects = Arrays.asList(math, science, english);
        Student student1 = new Student("Alice", student1Subjects);

        List<Subject> student2Subjects = Arrays.asList(math, science, english);
        Student student2 = new Student("Bob", student2Subjects);

        List<Subject> student3Subjects = Arrays.asList(math, science, english);
        Student student3 = new Student("Charlie", student3Subjects);

        List<Student> students = Arrays.asList(student1, student2, student3);

        // Calculate ranks
        RankCalculator rankCalculator = new RankCalculator();
        List<Student> rankedStudents = rankCalculator.calculateRanks(students);

        // Display ranked students
        System.out.println("Rank\tStudent\tTotal Marks");
        for (int i = 0; i < rankedStudents.size(); i++) {
            Student student = rankedStudents.get(i);
            System.out.println((i + 1) + "\t" + student.getName() + "\t" + student.getTotalMarks());
        }
    }
}

