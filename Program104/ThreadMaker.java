package Program104;

public class ThreadMaker extends Thread {

    @Override
    public void run() {
        try {
            sleep((long)Math.ceil(Math.random()));
            System.out.println(currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("\nException "+e+" occurred!!!");
        }    
    }

}