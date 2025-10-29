package seleniumHomework1;


public class OperatorsPractice {
    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        System.out.println("\n=== Assignment Operators ===");
        int num = 10;
        System.out.println("Initial value: " + num);
        num += 5;
        System.out.println("After += 5 : " + num);
        num -= 3;
        System.out.println("After -= 3 : " + num);
        num *= 2;
        System.out.println("After *= 2 : " + num);
        num /= 4;
        System.out.println("After /= 4 : " + num);
        num %= 3;
        System.out.println("After %= 3 : " + num);
    }
}
