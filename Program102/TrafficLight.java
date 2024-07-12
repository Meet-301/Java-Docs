package Program102;

public class TrafficLight extends Thread {

    private final TrafficLightColors color;

    TrafficLight(TrafficLightColors color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("\n\n%s SIGNAL ACTIVATED", color);
        try {
            sleep(color.getOnTime());
        } catch (InterruptedException e) {
            System.out.println("Exception " + e.getMessage() + " occurred!!!");
        }
        System.out.printf("\n%s SIGNAL DEACTIVATED", color);
    }

}