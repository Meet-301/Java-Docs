package Program104;

public class ThreadMaker implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep((long) Math.ceil(Math.random()));
            System.out.println("\n" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("\nException " + e + " occurred!!!");
        }
    }

}