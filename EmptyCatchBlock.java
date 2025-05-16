import java.io.FileInputStream;

public class EmptyCatchBlock {
    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream("nonexistent.txt");
        } catch (Exception e) {  // PMD: Avoid empty catch blocks
            // SpotBugs: REC_CATCH_EXCEPTION
        }
    }
}
