public class Main {
    private int number = 10;
    protected String name = "Abhirup";
    static final double PI = 3.14;

    public static void main(String[] args) {
        int a = 5, b = 2;
        char grade = 'A';
        boolean flag = true;
        String msg = "Hello Java";
        Object obj = null;

        int sum = a + b;
        int diff = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        if (sum > 5 && flag) {
            System.out.println("Sum is greater than 5");
        } else {
            System.out.println("Condition failed");
        }

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            default:
                System.out.println("Try again");
        }

        for (int i = 0; i < 3; i++) {
            if (i == 1) continue;
            System.out.println("For loop i = " + i);
        }

        int j = 0;
        while (j < 2) {
            System.out.println("While j = " + j);
            j++;
        }

        int x = 5;
        x++;
        x -= 2;

        String result = (x > 2) ? "Pass" : "Fail";
        System.out.println(result);

        int bit = (a & b) | (a ^ b);

        Main mainObj = new Main();
        if (mainObj instanceof Main) {
            System.out.println("Yes, it's a Main object");
        }

        int[] arr = {1, 2, 3};
        for (int val : arr) {
            System.out.println(val);
        }
        return;
    }
}
