import java.util.Scanner;

class Student {
    String name;
    String usn;
    String division;
    int[] marks = new int[5];
    int[] credits = new int[5];
    int totalMarks;
    double cgpa;
    double sgpa;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter USN: ");
        usn = scanner.nextLine();
        System.out.print("Enter Division: ");
        division = scanner.nextLine();
        System.out.println("Enter Marks of 5 Subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        System.out.println("Enter Credit Score of Each Subject:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Credit for Subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
        }
        System.out.print("Enter Total Marks: ");
        totalMarks = scanner.nextInt();
    }
