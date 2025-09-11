import java.util.Scanner;

public class EvenOdd {
  public void evenOdd() {
    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
        System.out.println("\n=== Even/Odd Checker ===");
        System.out.println("1. Check if number is even or odd");
        System.out.println("2. Check multiple numbers");
        System.out.println("3. Exit");
        System.out.print("Choose an option (1-3): ");

        int choice;
        try {
          choice = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a number between 1 and 3.");
          continue;
        }

        if (choice == 3)
          break;

        switch (choice) {
          case 1:
            checkSingleNumber(sc);
            break;
          case 2:
            checkMultipleNumbers(sc);
            break;
          default:
            System.out.println("Invalid choice. Please select a valid option.");
            break;
        }
      }
      System.out.println("Even/Odd checker exited. Thank you for using!");
    }
  }

  private void checkSingleNumber(Scanner sc) {
    try {
      System.out.print("Enter a number: ");
      int number = Integer.parseInt(sc.nextLine().trim());

      if (number % 2 == 0) {
        System.out.println(number + " is an even number.");
      } else {
        System.out.println(number + " is an odd number.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid input. Please enter a valid integer.");
    }
  }

  private void checkMultipleNumbers(Scanner sc) {
    try {
      System.out.print("How many numbers do you want to check? ");
      int count = Integer.parseInt(sc.nextLine().trim());

      if (count <= 0) {
        System.out.println("Please enter a positive number.");
        return;
      }

      System.out.println("Enter " + count + " numbers:");
      for (int i = 1; i <= count; i++) {
        System.out.print("Number " + i + ": ");
        int number = Integer.parseInt(sc.nextLine().trim());

        if (number % 2 == 0) {
          System.out.println("  " + number + " is even");
        } else {
          System.out.println("  " + number + " is odd");
        }
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid input. Please enter valid integers.");
    }
  }
}
