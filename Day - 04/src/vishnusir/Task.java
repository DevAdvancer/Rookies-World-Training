package vishnusir;
import java.util.Scanner;

public class Task {
  public void printFibonacciSeries(int n) {
    int a = 0, b = 1;
    System.out.print("Fibonacci Series: " + a + ", " + b);
    for (int i = 2; i < n; i++) {
      int c = a + b;
      System.out.print(", " + c);
      a = b;
      b = c;
    }
    System.out.println();
  }

  public void guessNumber() {
    Scanner sc = new Scanner(System.in);

    int numberToGuess = (int) (Math.random() * 100) + 1;
    int userGuess = -1;

    System.out.print("Guess a number between 1 and 100: ");
    while (userGuess != numberToGuess) {
      userGuess = sc.nextInt();
      if (userGuess < numberToGuess) {
        System.out.print("Too low! Try again! ");
      } else if (userGuess > numberToGuess) {
        System.out.print("Too high! Try again! ");
      } else {
        System.out.print("Congratulations! You've guessed the number!");
      }
    }
  }
}
