import java.util.Scanner;
import rajeevsir.*;

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

    // The 20 questions of tasks below
    task.printHelloWorld();
    task.printPersonalInfo("Abhirup Kumar", 21, "India");
    task.swapWithTemp(5, 10);
    task.swapWithoutTemp(5, 10);
    // others like that

    Array array = new Array();
    Rookies rk = new Rookies();

    rk.Array1();

    System.out.print("Enter size of array: ");
    int size = sc.nextInt();

    array.printArray(size);
  }
}
