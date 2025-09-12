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

    public void printHelloWorld() {
      System.out.println("Hello, World!");
    }

    public void printPersonalInfo(String name, int age, String city) {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("City: " + city);
    }

    public void swapWithTemp(int a, int b) {
      int temp = a;
      a = b;
      b = temp;
      System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public void swapWithoutTemp(int a, int b) {
      a = a + b;
      b = a - b;
      a = a - b;
      System.out.println("After swap: a = " + a + ", b = " + b);
    }

    public void printAsciiValue(char ch) {
      System.out.println("ASCII value of '" + ch + "' is " + (int) ch);
    }

    public void celsiusToFahrenheit(double celsius) {
      double fahrenheit = (celsius * 9/5) + 32;
      System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }

    public void fahrenheitToCelsius(double fahrenheit) {
      double celsius = (fahrenheit - 32) * 5/9;
      System.out.println(fahrenheit + "°F = " + celsius + "°C");
    }

    public void areaOfCircle(double radius) {
      double area = Math.PI * radius * radius;
      System.out.println("Area of circle: " + area);
    }

    public void perimeterOfRectangle(double length, double width) {
      double perimeter = 2 * (length + width);
      System.out.println("Perimeter of rectangle: " + perimeter);
    }

    public void checkEvenOdd(int num) {
      if (num % 2 == 0)
        System.out.println(num + " is Even");
      else
        System.out.println(num + " is Odd");
    }

    public void checkNumberSign(int num) {
      if (num > 0)
        System.out.println(num + " is Positive");
      else if (num < 0)
        System.out.println(num + " is Negative");
      else
        System.out.println("Number is Zero");
    }

    public void largestOfTwo(int a, int b) {
      System.out.println("Largest: " + (a > b ? a : b));
    }

    public void smallestOfTwo(int a, int b) {
      System.out.println("Smallest: " + (a < b ? a : b));
    }

    public void addWithoutPlus(int a, int b) {
      while (b != 0) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;
      }
      System.out.println("Sum: " + a);
    }

    public void multiplyWithoutStar(int a, int b) {
      int result = 0;
      for (int i = 0; i < b; i++) {
        result += a;
      }
      System.out.println("Product: " + result);
    }

    public void printMultiplicationTable(int num) {
      for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
      }
    }

    public void simpleInterest(double principal, double rate, double time) {
      double si = (principal * rate * time) / 100;
      System.out.println("Simple Interest: " + si);
    }

    public void compoundInterest(double principal, double rate, double time) {
      double ci = principal * Math.pow((1 + rate / 100), time) - principal;
      System.out.println("Compound Interest: " + ci);
    }

    public void isLeapYear(int year) {
      boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
      System.out.println(year + (leap ? " is a Leap Year" : " is not a Leap Year"));
    }

    public void quadraticRoots(double a, double b, double c) {
      double d = b * b - 4 * a * c;
      if (d > 0) {
        double root1 = (-b + Math.sqrt(d)) / (2 * a);
        double root2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Roots are real and different: " + root1 + ", " + root2);
      } else if (d == 0) {
        double root = -b / (2 * a);
        System.out.println("Roots are real and same: " + root);
      } else {
        double real = -b / (2 * a);
        double imag = Math.sqrt(-d) / (2 * a);
        System.out.println("Roots are complex: " + real + " + " + imag + "i, " + real + " - " + imag + "i");
      }
    }

    
}
