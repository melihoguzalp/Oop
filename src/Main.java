public class Main {

    public static void main(String[] args){


        Car car1 = new Car();
        Car car2 = new Car("Ford" , "blue" , 3 , "16" , 4);

       // car1.setModel("Ford");
       // System.out.println("The model of car is " + car1.getModel());

       // car1.setCarDoor(1);

        car2.setColor("Blue");
        System.out.println(car2.getColor());
    }

}
