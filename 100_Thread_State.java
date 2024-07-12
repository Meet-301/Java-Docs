class ThreadState extends Thread {

    @Override
    public void run() {
        try {
            sleep(3000);
            System.out.println("Thread's current state is: " + getState());
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage() + " occurred!!!");
        }
    }

    @SuppressWarnings("static-access")
    public static void main(String args[]) throws InterruptedException {
        System.out.println("\nThread State Printer\n");

        ThreadState ts = new ThreadState();

        System.out.println("Thread's current state is: " + ts.getState());
        ts.start();

        ts.join();
        ts.sleep(3000);
        System.out.println("Thread's current state is: " + ts.getState());
    }
}