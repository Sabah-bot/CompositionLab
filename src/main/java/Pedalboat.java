public class Pedalboat extends Vehicle implements IWaterVehicle{


    private int numberOfSeats;
    private String hulltype;


    public Pedalboat(float weight, int maxSpeed, String hullType, int numberOfSeats){
        super(weight, maxSpeed);
        this.hulltype = hullType;
        this.numberOfSeats = numberOfSeats;


    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getHullType(){
        return this.hulltype;
    }

    public void setHullType(String hullType) {
        this.hulltype = hullType;
    }


    }


