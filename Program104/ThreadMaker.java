package Program104;

public class ThreadMaker implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(getRandom() * 1000);
            System.out.println("\n" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("\nException " + e + " occurred!!!");
        }
    }

    private long getRandom() {
        long random = (long) Math.random()*5 + 1;
        return random;
    }

}