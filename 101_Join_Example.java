class JoinExample extends Thread {

    @SuppressWarnings("static-access")
    @Override
    public void run() {
        try {
            currentThread().sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage() + " occurred!!!!");
        }
    }

    public static void main(String args[]) throws InterruptedException {
        System.out.println("\nJoin Method Example\n");

        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();
        JoinExample t3 = new JoinExample();

        long t1start, t2start, t3start, t1end, t2end, t3end;

        t1start = System.currentTimeMillis();
        t1.start();
        t1.join();
        t1end = System.currentTimeMillis();
        System.out.println(t1.getName() + "'s Starting time is: " + t1start + " and ending time is: " + t1end);

        t2start = System.currentTimeMillis();
        t2.start();
        t2.join();
        t2end = System.currentTimeMillis();
        System.out.println(t2.getName() + "'s Starting time is: " + t2start + " and ending time is: " + t2end);

        t3start = System.currentTimeMillis();
        t3.start();
        t3.join();
        t3end = System.currentTimeMillis();
        System.out.println(t3.getName() + "'s Starting time is: " + t3start + " and ending time is: " + t3end + "\n");

    }
}