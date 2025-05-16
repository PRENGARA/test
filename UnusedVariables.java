public class UnusedVariables {
    public void doSomething() {
        int unused = 42;  // PMD: Unused local variable
        String neverUsed = "hello";  // SpotBugs: UUF_UNUSED_FIELD
        
        System.out.println("This method does nothing useful");
    }
}
