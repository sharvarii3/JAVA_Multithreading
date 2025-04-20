// Name: Sharvari Godbole
// PRN no.: 23070126117
// Batch: AIML B-2 (2023-2027)

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started.\n");

        // Creating threads for operations
        Thread t1 = new Thread(new TaskOne());
        Thread t2 = new Thread(new TaskTwo());

        // Starting the threads
        t1.start();
        t2.start();

        // Ensuring all threads complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nMain thread finished.");
    }
}
