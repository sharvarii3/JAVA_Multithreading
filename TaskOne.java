// TaskOne.java
class TaskOne implements Runnable {
    // Function to print numbers
    public void run() {
        System.out.println("TaskOne thread started.");
        printNumbers();
        System.out.println("TaskOne thread finished.");
    }

    public void printNumbers() {
        // Logic: printing numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("TaskOne: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}