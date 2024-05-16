public class Speedboat extends Vehicle implements IWaterVehicle, IEngine{

    private boolean needsCrew;
    private String hulltype;
    private IEngine engine;
    private IWaterVehicle waterVehicle;

    public Speedboat(float weight, int maxSpeed, int horsePower, boolean needsCrew, IEngine engine, IWaterVehicle waterVehicle, String hullType){
        super(weight, maxSpeed); //cutfibreglass
        this.needsCrew = needsCrew;
        this.engine = engine;
        this.hulltype= hullType;
    }

    public boolean getNeedsCrew() {
        return needsCrew;
    }

    public void setNeedsCrew(boolean needsCrew) {
        this.needsCrew = needsCrew;
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
