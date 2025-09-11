import java.util.Scanner;

public class Calculator {
  public void Calculator() {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        System.out.println("\n=== Calculator Menu ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Modulus");
        System.out.println("7. Exit");
        System.out.print("Choose an operation (1-7): ");

        int choice;
        try {
          choice = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a number between 1 and 7.");
          continue;
        }

        if (choice == 7)
          break;

        double num1, num2;
        try {
          System.out.print("Enter first number: ");
          num1 = Double.parseDouble(sc.nextLine().trim());
          System.out.print("Enter second number: ");
          num2 = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
          System.out.println("Invalid number input. Please try again.");
          continue;
        }

        double result;
        switch (choice) {
          case 1 -> result = num1 + num2;
          case 2 -> result = num1 - num2;
          case 3 -> result = num1 * num2;
          case 4 -> {
              if (num2 == 0) {
                  System.out.println("Cannot divide by zero.");
                  continue;
              }
              result = num1 / num2;
              }
          case 5 -> result = Math.pow(num1, num2);
          case 6 -> {
              if (num2 == 0) {
                  System.out.println("Cannot perform modulus by zero.");
                  continue;
              }
              result = num1 % num2;
              }
          default -> {
              System.out.println("Invalid choice. Please select a valid option.");
              continue;
              }
        }
        System.out.printf("Result: %.4f\n", result);
      }
      System.out.println("Calculator exited. Thank you for using!");
    }
  }

}
