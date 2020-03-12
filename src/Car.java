public class Car {
    private String model;
    private String color;
    private int carDoor;
    private String engine;
    private int wheel;
    public Car(){  //Constructor//Bos constructor gibi dusun

        System.out.println("This is my Constructor");
    }
    public Car(String model , String color , int carDoor , String engine , int wheel){
        this.model = model;
        this.color = color;
        this.carDoor = carDoor;
        this.engine = engine;
        this.wheel = wheel;
    }
    public void setModel(String model){

        this.model = model;
    }
    public String getModel(){

        return this.model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCarDoor() {
        return carDoor;
    }
    public void setCarDoor(int carDoor) {
        this.carDoor = carDoor;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public int getWheel() {
        return wheel;
    }
    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
