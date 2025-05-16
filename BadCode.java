// File: BadCode.java
public class BadCode {
    public static void main(String[] args) {
        int unused = 5; // Unused variable
        try {
            int x = 1 / 0;
        } catch (Exception e) {} // Empty catch block
    }
}
