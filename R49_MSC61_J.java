// Rule 49: Miscellaneous (MSC)
// MSC61-J: Do not use insecure random numbers
// Non compliant code
import java.util.Random;

public class R49_MSC61_J {
    public static void main(String[] args) {
        Random rand = new Random(); // Insecure random number generator
        System.out.println("Random number: " + rand.nextInt());
    }
}

// Compliant code
import java.security.SecureRandom;

public class R49_MSC61_J {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom(); // Secure random generator
        System.out.println("Secure random number: " + rand.nextInt());
    }
}
