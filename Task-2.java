package codsoft;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int numSubjects = getNumberOfSubjects(scanner);

        
        int totalMarks = calculateTotalMarks(scanner, numSubjects);
        double averagePercentage = (double) totalMarks / numSubjects;

        
        char grade = calculateGrade(averagePercentage);

        
        displayResults(totalMarks, averagePercentage, grade);

        
        scanner.close();
    }

    private static int getNumberOfSubjects(Scanner scanner) {
        System.out.print("Enter the number of subjects: ");
        return scanner.nextInt();
    }

    private static int calculateTotalMarks(Scanner scanner, int numSubjects) {
        int totalMarks = 0;

        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int subjectMarks = scanner.nextInt();
            totalMarks += subjectMarks;
        }

        return totalMarks;
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }

    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
