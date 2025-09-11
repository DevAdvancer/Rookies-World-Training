public class Questions {

    // Arithmetic Operators
    public void q1() {
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    public void q2() {
        System.out.println("10 / 3 = " + (10 / 3));
    }

    public void q3() {
        System.out.println("10 / 4 = " + (10 / 4));
        System.out.println("10.0 / 4 = " + (10.0 / 4));
    }

    public void q4() {
        System.out.println("10 % 3 = " + (10 % 3));
    }

    public void q5() {
        System.out.println("10 / 0.0 = " + (10 / 0.0));
    }

    public void q6() {
        System.out.println("10 % 0.0 = " + (10 % 0.0));
    }

    public void q7() {
        System.out.println("'A' + 1 = " + ('A' + 1));
    }

    public void q8() {
        int x = 5;
        System.out.println("x++ = " + (x++));
        System.out.println("++x = " + (++x));
    }

    public void q9() {
        System.out.println("Integer division 7/2 = " + (7 / 2));
        System.out.println("Floating division 7/2.0 = " + (7 / 2.0));
    }

    public void q10() {
        System.out.println("\"10\" + 20 + 30 = " + ("10" + 20 + 30));
    }

    // Relational Operators
    public void q11() { System.out.println(10 > 5); }
    public void q12() { System.out.println(10 < 5); System.out.println(10 > 5); }
    public void q13() { System.out.println(10.5 == 10.5); }
    public void q14() { System.out.println('A' == 65); }
    public void q15() { System.out.println("Hello" == "Hello"); }
    public void q16() { System.out.println(new String("Hi") == new String("Hi")); }
    public void q17() { System.out.println("Hi".equals("Hi")); }
    public void q18() { System.out.println(10 != 20); }
    public void q19() { System.out.println(10 >= 5); System.out.println(5 <= 5); }
    public void q20() { System.out.println(5 <= 2); }

    // Logical Operators
    public void q21() { System.out.println(true && false); }
    public void q22() { System.out.println(true || false); }
    public void q23() { System.out.println(!true); }
    public void q24() {
        int a = 5;
        System.out.println((a > 0) & (a++ > 3));
        System.out.println("a = " + a);
        a = 5;
        System.out.println((a > 0) && (a++ > 3));
        System.out.println("a = " + a);
    }
    public void q25() {
        int b = 5;
        System.out.println((b < 0) | (b++ > 3));
        System.out.println("b = " + b);
        b = 5;
        System.out.println((b < 0) || (b++ > 3));
        System.out.println("b = " + b);
    }
    public void q26() { System.out.println(true ^ false); }
    public void q27() { System.out.println(true ^ true); }
    public void q28() {
        int n = 7;
        System.out.println(n > 1 && n < 10);
    }
    public void q29() {
        int n = 55;
        System.out.println(n < 5 || n > 50);
    }
    public void q30() {
        boolean cond = false;
        System.out.println(!cond);
    }

    // Assignment Operators
    public void q31() { int a = 10; a += 5; System.out.println(a); }
    public void q32() { int a = 10; a -= 3; System.out.println(a); }
    public void q33() { int a = 10; a *= 2; System.out.println(a); }
    public void q34() { int a = 10; a /= 2; System.out.println(a); }
    public void q35() { int a = 10; a %= 3; System.out.println(a); }

    // Ternary Operators
    public void q36() { int a = 10, b = 20; System.out.println(a > b ? a : b); }
    public void q37() { int a = -5; System.out.println(a >= 0 ? "Positive" : "Negative"); }
    public void q38() {
        int a = 10, b = 20, c = 30;
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Max = " + max);
    }
    public void q39() {
        int n = 7;
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
    }
    public void q40() {
        int x = 5;
        String result = (x > 0) ? ((x % 2 == 0) ? "Positive Even" : "Positive Odd") : "Negative";
        System.out.println(result);
    }

    // Bitwise Operators
    public void q41() { System.out.println(5 & 3); }
    public void q42() { System.out.println(5 | 3); }
    public void q43() { System.out.println(5 ^ 3); }
    public void q44() { System.out.println(~5); }
    public void q45() { System.out.println(5 << 1); }
    public void q46() { System.out.println(5 >> 1); }
    public void q47() { System.out.println(-5 >> 1); }
    public void q48() { System.out.println(-5 >>> 1); }
    public void q49() { int a = 5; a <<= 2; System.out.println(a); }
    public void q50() { int b = 20; b >>= 2; System.out.println(b); }
}
