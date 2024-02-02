import java.util.*;
public class MarksTreeMapMIS1146 {
    public static void main(String[] args) {
        TreeMap<String, Double> studentCGPA = new TreeMap<>();
        Scanner input = new Scanner(System.in);
        // Store the name of the student as a key and CGPA as a value in a TreeMap
        studentCGPA.put("Surya", 9.4);
        studentCGPA.put("Rajeev", 9.6);
        studentCGPA.put("Nandy", 9.8);
        studentCGPA.put("Priyanka", 9.6);

        // Display the CGPA for the given name of the student
        System.out.print("Enter the name of the Student : ");
        String studentName = input.next();
        double cgpa = studentCGPA.get(studentName);
        System.out.println("CGPA for " + studentName + ":" + cgpa);
        input.close();
    }
}
