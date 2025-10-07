package rajeevsir;

import java.util.Scanner;

public class Task {
  Scanner sc = new Scanner(System.in);

  public void whileLoop() {
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();

    whileLoop array = new whileLoop();
    array.takeInputArray(size);
    System.out.println("");
    array.displayArray(size);
    System.out.println("");
  }

  public void doWhileLoop() {
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();

    doWhileLoop array = new doWhileLoop();
    array.takeInputArray(size);
    System.out.println("");
    array.displayArray(size);
    System.out.println("");
  }

  public void forLoop() {
    System.out.print("Enter the size of array: ");
    int size = sc.nextInt();

    forLoop array = new forLoop();
    array.takeInputArray(size);
    System.out.println("");
    array.displayArray(size);
    System.out.println("");
  }
}


class whileLoop extends Task {
  String[] arr;

  public void takeInputArray(int size) {
    arr = new String[size];
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.next();
    }
  }

  public void displayArray(int size) {
    System.out.println("The elements of array are: ");
    int i = 0;
    while (i < size) {
      System.out.print(arr[i] + " ");
      i++;
    }
  }
}


class doWhileLoop extends Task {
  String[] arr;

  public void takeInputArray(int size) {
    arr = new String[size];
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.next();
    }
  }

  public void displayArray(int size) {
    System.out.println("The elements of array are: ");
    int i = 0;
    do {
      System.out.print(arr[i] + " ");
      i++;
    } while (i < size);
  }
}


class forLoop extends Task {
  String[] arr;

  public void takeInputArray(int size) {
    arr = new String[size];
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.next();
    }
  }

  public void displayArray(int size) {
    System.out.println("The elements of array are: ");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
