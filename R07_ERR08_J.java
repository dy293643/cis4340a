// Rule 07: Exceptional Behavior (ERR)
// ERR08-J: Do not catch NullPointerException, ArrayIndexOutOfBoundsException, or ArithmeticException
// Non compliant
public class R07_ERR08_J {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) { // Catching specific exception
            System.out.println("Error: Division by zero");
        }
    }
}

// Compliant code
public class R07_ERR08_J {
    public static void main(String[] args) {
        int divisor = 0;
        if (divisor != 0) {
            int result = 10 / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Attempted division by zero");
        }
    }
}
