import java.util.*;

public class Grades {
    public static void main(String[] args) {

        Map<String, Double> studentGPA = new HashMap<>();

        studentGPA.put("Selcan", 3.55);
        studentGPA.put("Nazrin", 3.0);
        studentGPA.put("Leyla", 3.4);
        studentGPA.put("Zahra", 3.2);
        studentGPA.put("Simara", 3.3);

        double maxGPA = Collections.max(studentGPA.values());
        System.out.println("Highest GPA: " + maxGPA);
        System.out.println("Student(s) with highest GPA:");

        for (Map.Entry<String, Double> entry : studentGPA.entrySet()) {
            if (entry.getValue() == maxGPA) {
                System.out.println(entry.getKey());
            }
        }

        double sum = 0;
        for (double gpa : studentGPA.values()) {
            sum += gpa;
        }

        double average = sum / studentGPA.size();
        System.out.println("Average GPA: " + average);

        int count = 0;
        for (double gpa : studentGPA.values()) {
            if (gpa < average) {
                count++;
            }
        }

        System.out.println("Number of students below average: " + count);
    }
}
