package nestedclass.staticinnerclass;

public class Client {

    public static void main(String[] args) {
        Car.Wheel myWheel = new Car.Wheel();
        myWheel.setDiameter(200);
        System.out.println(myWheel.getDiameter());
    }

}
