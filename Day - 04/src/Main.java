import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    vishnusir.Task task = new vishnusir.Task();

    // Fibonacci series
    System.out.print("Enter Range: ");
    int rng = sc.nextInt();
    task.printFibonacciSeries(rng);

    // Guess the number game
    task.guessNumber();
  }
}
