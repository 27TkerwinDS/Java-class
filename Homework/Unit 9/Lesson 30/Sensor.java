public abstract class Sensor {
    public String name;
    public int modelNumber;
    public Sensor(String name, int modelNumber){
        this.modelNumber=modelNumber;
        this.name=name;
    }
    public void setModelNumber(int modelNumber){
        this.modelNumber=modelNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getModelNumber(){
        return modelNumber;
    }
    public String getName(){
        return name;
    }
    public abstract void recordMesurment();
}
