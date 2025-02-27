// Rule 14: Serialization (SER)
// SER03-J: Do not serialize untrusted data
// Non compliant code
import java.io.Serializable;

public class R14_SER03_J implements Serializable {
    private String username;
    private String password; // Sensitive data is serialized

    public R14_SER03_J(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

// Compliant code
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class R14_SER03_J implements Serializable {
    private String username;
    private transient String password; // Prevents serialization

    public R14_SER03_J(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) throws Exception {
        throw new UnsupportedOperationException("Serialization not allowed");
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        throw new UnsupportedOperationException("Deserialization not allowed");
    }
}
