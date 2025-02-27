// Rule 09: Locking (LCK)
// LCK01-J: DO not synchronize on objects that may be reused
// Non compliant code
public class R09_LCK01_J {
    private static final String LOCK = "LOCK";

    public void badLocking() {
        synchronized (LOCK) { // Locking on a String literal (dangerous)
            System.out.println("Locked on LOCK string.");
        }
    }
}

// Compliant code
public class R09_LCK01_J {
    private final Object lock = new Object(); // Proper lock object

    public void goodLocking() {
        synchronized (lock) { // Locking on a dedicated object
            System.out.println("Locked on private object.");
        }
    }
}
