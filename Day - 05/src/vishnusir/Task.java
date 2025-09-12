package vishnusir;
import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the total number of Students: ");
    int numStudents = sc.nextInt();
    sc.nextLine();
    StudentRecordsViaInput records = new StudentRecordsViaInput(numStudents);

    while (true) {
      System.out.println("\n--- Student Details Program ---");
      System.out.println("1. Enter ALL Student Details (Loop)");
      System.out.println("2. Enter ONE Student Details (Manually)");
      System.out.println("3. Display Student Details");
      System.out.println("4. Exit");
      System.out.print("Choose Option: ");
      int option = sc.nextInt();
      sc.nextLine();

      switch (option) {
        case 1 -> records.takeInputAll();
        case 2 -> records.takeInputOne();
        case 3 -> records.display();
        case 4 -> {
          System.out.println("Exiting...");
          return;
        }
        default -> System.out.println("Invalid option. Try again.");
      }
    }
  }
}

class Student {
  String name;
  int age;
  String city;

  Student(String name, int age, String city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }
}

class StudentRecordsViaInput {
  Scanner sc = new Scanner(System.in);
  Student[] students;

  public StudentRecordsViaInput(int size) {
    students = new Student[size];
  }

  void takeInputAll() {
    sc.nextLine();
    for (int i = 0; i < students.length; i++) {
      System.out.println("\nEnter details of student " + (i + 1));
      students[i] = readStudent();
    }
    System.out.println("All student details recorded successfully.");
  }

  void takeInputOne() {
    System.out.print("Enter student number (1 to " + students.length + "): ");
    int index = sc.nextInt() - 1;
    sc.nextLine();

    if (index < 0 || index >= students.length) {
      System.out.println("Invalid student number.");
      return;
    }

    System.out.println("\nEnter details of student " + (index + 1));
    students[index] = readStudent();
    System.out.println("Student " + (index + 1) + " recorded successfully.");
  }

  private Student readStudent() {
    System.out.print("Enter full name: ");
    String name = sc.nextLine();

    System.out.print("Enter age: ");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter city: ");
    String city = sc.nextLine();

    return new Student(name, age, city);
  }

  void display() {
    System.out.println("\n--- Student Details ---");
    for (int i = 0; i < students.length; i++) {
      if (students[i] != null) {
        System.out.println("\nStudent " + (i + 1));
        System.out.println("Name: " + students[i].name);
        System.out.println("Age: " + students[i].age);
        System.out.println("City: " + students[i].city);
      } else {
        System.out.println("\nStudent " + (i + 1) + ": No data entered yet.");
      }
    }
  }
}
