public class NullPointerRisk {
    public void riskyMethod(String input) {
        // PMD: Avoid throwing null pointer exceptions
        System.out.println(input.length());  // SpotBugs: NP_NULL_ON_SOME_PATH
        
        if (input == null) {
            System.out.println("Too late!");
        }
    }
}
