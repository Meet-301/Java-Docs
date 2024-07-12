package Program86;

public class Car extends Vehicle {

    @Override
    void service() {
        super.service();
        System.out.println("Car's Service Center\n");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.service();
    }

}