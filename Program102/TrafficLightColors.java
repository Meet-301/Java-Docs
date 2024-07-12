package Program102;

public enum TrafficLightColors {
    RED(10000), YELLOW(3000), GREEN(7000);

    private final int onTime;

    public int getOnTime() {
        return onTime;
    }

    TrafficLightColors(int onTime) {
        this.onTime = onTime;
    }

}