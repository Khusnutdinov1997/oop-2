public class Truck extends Transport{
    public Truck(String modelName, int wheelsCount) {
        super (modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышки на грузовике");
    }

    public void diagnostics() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
