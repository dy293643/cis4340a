// Rule 13: Input Output (FIO)
// FIO02 - J: Detect and handle file-related errors
// Non compliant code
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class R13_FIO02_J {
    public void readFile(String filename) throws IOException {
        FileReader fr = new FileReader(new File(filename));
        fr.read();
        fr.close(); // No error handling
    }
}


// Compliant code
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class R13_FIO02_J {
    public void readFile(String filename) {
        try (FileReader fr = new FileReader(new File(filename))) { // Try-with-resources
            fr.read();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
