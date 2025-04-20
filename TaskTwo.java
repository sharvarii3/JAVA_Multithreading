// TaskTwo.java
class TaskTwo implements Runnable {
    // Function to print characters
    public void run() {
        System.out.println("TaskTwo thread started.");
        printCharacters();
        System.out.println("TaskTwo thread finished.");
    }

    public void printCharacters() {
        // Logic: printing characters from A to E
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("TaskTwo: " + ch);
            try {
                Thread.sleep(500); // pause for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
