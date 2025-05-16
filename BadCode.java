public class BadCode {
    public static void main(String[] args) {
        int unused = 42; // Unused variable
        try {
            int result = 10 / 0;
        } catch (Exception e) {
        } // Empty catch block
    }
}
