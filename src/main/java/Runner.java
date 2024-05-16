public class Runner {

    public static void main(String[] args) {
        IEngine hondaEngine = new CombustionEngine(99,"01/01/2023");
        Car jazz = new Car(1100.0f, 160, "hatchback", hondaEngine);

        System.out.println(jazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(1000,100);
        jazz.setEngine(electricEngine);
        System.out.println(jazz.getHorsePower());




//Test that you can create an engine-using water vehicle, change its engine, then check its properties in the Runner!


     CargoShip cargoShip = new CargoShip(12000,54,"steel",450, hondaEngine);
    System.out.println(cargoShip.getEngine());

    cargoShip.setEngine(electricEngine);
    System.out.println(cargoShip.getEngine());

}
}
