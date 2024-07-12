package Program102;

public class Road {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight red = new TrafficLight(TrafficLightColors.RED);
        TrafficLight green = new TrafficLight(TrafficLightColors.GREEN);
        TrafficLight yellow = new TrafficLight(TrafficLightColors.YELLOW);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
        green.join();
        System.out.println();
    }
}