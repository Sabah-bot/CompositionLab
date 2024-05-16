public class CargoShip extends Vehicle implements IWaterVehicle, IEngine {

    private int numberOfContainers;
    private String hulltype;
    private IEngine engine;

    public CargoShip(float weight, int maxSpeed, String hullType, int numberOfContainers, IEngine engine){
        super(weight, maxSpeed);        //"Steel" --> left out due to errors --> may need later
        this.hulltype = hullType;
        this.numberOfContainers = numberOfContainers;
        this.engine = engine;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }

    public String getHullType(){
        return hulltype;
    }

    public void setHullType(String hullType) {
        this.hulltype = hullType;
    }


    public IEngine getEngine(){
        return engine;

    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public int getHorsePower() {
        return this.engine.getHorsePower();
    }


    public void setHorsePower(int horsePower) {
        this.engine.setHorsePower(horsePower);
    }

}

