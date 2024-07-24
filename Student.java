import java.util.Scanner;
interface TotalCalculator {
    int calculateTotal(int[] marks);
}
interface GradeCalculator {
    String determineGrade(int total, int numSubjects);
}
class Student implements TotalCalculator, GradeCalculator {
    private int[] marks;
    private int total;
    private String grade;
    public Student(int[] marks) {
        this.marks = marks;
        this.total = calculateTotal(marks);
        this.grade = determineGrade(this.total, marks.length);
    }

    @Override
    public int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    @Override
    public String determineGrade(int total, int numSubjects) {
        double aggregate = (double) total / numSubjects;
        if (aggregate > 75) {
            return "Distinction";
        } else if (aggregate > 60) {
            return "First Division";
        } else if (aggregate > 50) {
            return "Second Division";
        } else if (aggregate > 40) {
            return "Third Division";
        } else {
            return "FAIL";
        }
    }

    public void displayDetails() {
        System.out.println("Total Marks: " + total);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[6];

        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            marks[i] = scanner.nextInt();
        }

        Student student = new Student(marks);
        student.displayDetails();

        scanner.close();
    }
}
