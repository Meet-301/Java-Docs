class ThreadsPrinter extends Thread {

    private int x;

    ThreadsPrinter(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from thread " + x);
        }
    }

    public static void main(String args[]) {
        System.out.println("\nWelcome to threads printer\n");

        ThreadsPrinter t1 = new ThreadsPrinter(1);
        ThreadsPrinter t2 = new ThreadsPrinter(2);

        t1.start();
        t2.start();
    }
}