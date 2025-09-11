import java.util.Scanner;

public class Loop {
  Scanner sc = new Scanner(System.in);
  void loop() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("Iteration: " + i);
    }
  }

  void table() {
    System.out.print("Enter a num: ");
    int num = sc.nextInt();

    for (int i = 0; i < 10; i++) {
      System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
    }
  }

  void pattern() {
    System.out.print("Enter number of grid: ");
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      for (int j = 1; j <= num; j++) {
      System.out.print(j);
      }
      System.out.println();
    }
  }

  void pattern1() {
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();

    for (int i = 0; i < rows; i++) {
      for (int j = 1; j <= i; j++) {
      System.out.print("* ");
      }
      System.out.println();
    }
  }

  void pattern2() {
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();

    int i = 0;
    while (i < rows) {
      int j = 0;
      while (j <= i) {
      System.out.print("* ");
      j++;
      }
      System.out.println();
      i++;
    }
  }
}
