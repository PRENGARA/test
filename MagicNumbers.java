public class MagicNumbers {
    public void calculate() {
        // PMD: Avoid using magic numbers
        double result = 3.14159 * 5 * 5;  // SpotBugs: DMI_CONSTANT_DB_PASSWORD
        
        System.out.println("Area: " + result);
    }
}
