public class InfiniteLoop {
    public void loopForever() {
        // SpotBugs: IL_INFINITE_LOOP
        while (true) {  // PMD: Avoid infinite loops
            System.out.println("Going forever...");
        }
    }
}
