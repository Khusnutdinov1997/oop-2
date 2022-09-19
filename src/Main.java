public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);

        Truck truck = new Truck("truck", 6);

        Bicycle bicycle = new Bicycle("bicycle1",2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(truck);
    }
}