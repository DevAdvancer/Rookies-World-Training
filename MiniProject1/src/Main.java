import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    System.out.print("Enter number of subjects: ");
    int subjectCount = sc.nextInt();
    sc.nextLine();

    String[] subjectNames = new String[subjectCount];
    for (int i = 0; i < subjectCount; i++) {
      System.out.print("Enter name of subject " + (i + 1) + ": ");
      subjectNames[i] = sc.nextLine();
    }

    Stundet[] students = new Stundet[0];
    int studentCount = 0;

    while (true) {
      System.out.println("1. Add Student");
      System.out.println("2. Print All Reports");
      System.out.println("3. Exit");
      System.out.print("Enter choice: ");
      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1 ->  {
          System.out.print("Enter student name: ");
          String name = sc.nextLine();

          System.out.print("Enter roll number: ");
          int rollNo = sc.nextInt();
          sc.nextLine();

          System.out.print("Enter class: ");
          String className = sc.nextLine();

          int[] marks = new int[subjectCount];

          for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks for " + subjectNames[i] + ": ");
            marks[i] = sc.nextInt();
          }
          sc.nextLine();

          Stundet[] newStudents = new Stundet[studentCount + 1];
          System.arraycopy(students, 0, newStudents, 0, studentCount);

          newStudents[studentCount] = new Stundet(name, rollNo, className, marks, subjectNames);

          students = newStudents;
          studentCount++;

          System.out.println("Student added.");
          System.out.println("");
        } case 2 ->  {
          for (int i = 0; i < studentCount; i++) {
            ReportCard rc = new ReportCard(students[i]);
            rc.printReport();
            System.out.println();
          }
        } case 3 ->  {
          System.out.println("Exiting...");
          sc.close();
          return;
        } default -> System.out.println("Invalid choice.");
      }
    }
  }
}


class Stundet {
  String name;
  int rollNo;
  String className;
  int[] marks;
  String[] subjectNames;

  public Stundet(String name, int rollNo, String className, int[] marks, String[] subjectNames) {
    this.name = name;
    this.rollNo = rollNo;
    this.className = className;
    this.marks = marks;
    this.subjectNames = subjectNames;
  }

  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
    System.out.println("Class: " + className);
    System.out.print("Marks: ");
    for (int i = 0; i < marks.length; i++) {
      System.out.println(subjectNames[i] + ": " + marks[i]);
    }
    System.out.println();
  }
}

class ReportCard {
  Stundet stu;
  public ReportCard(Stundet stu) {
    this.stu = stu;
  }
  public void printReport() {
    System.out.println("");
    stu.displayInfo();
    int total = 0;
    for (int mark : stu.marks) {
      total += mark;
    }
    double percentage = total / (double)stu.marks.length;
    String grade;
    if (percentage >= 90) grade = "A+";
    else if (percentage >= 80) grade = "A";
    else if (percentage >= 70) grade = "B+";
    else if (percentage >= 60) grade = "B";
    else if (percentage >= 50) grade = "C";
    else if (percentage >= 35) grade = "D";
    else grade = "F";
    System.out.println("Total: " + total);
    System.out.println("Percentage: " + percentage);
    System.out.println("Grade: " + grade);
    if (grade.equals("F")) {
      System.out.println("Result: Fail");
    } else {
      System.out.println("Result: Pass");
    }
    System.out.println("Final Report Printed");
  }
}
