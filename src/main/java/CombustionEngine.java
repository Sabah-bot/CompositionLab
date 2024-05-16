public class CombustionEngine implements IEngine {

    private int horsePower;
    public String lastOilChange;

    public CombustionEngine(int horsePower, String lastOilChange){
        this.horsePower = horsePower;
        this.lastOilChange = lastOilChange;

    }

    public int getHorsePower(){
        return this.horsePower;
    }


    public void setHorsePower(int horsePower){
        this.horsePower= horsePower;

    }

    public String getLastOilChange (int oilChange){
        return this.lastOilChange;
    }

    public void setLastOilChange(String lastOilChange){
        this.lastOilChange =lastOilChange;

    }

}
