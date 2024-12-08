package nestedclass.innerclass;

public class Client {

    public static void main(String[] args) {
        // Car.Wheel myWheel = new Car.Wheel(); //static inner class
        Car car = new Car();
        Car.Wheel wheel = car.new Wheel(); // inner class
        wheel.setDiameter(222);
        System.out.println(wheel.getDiameter());
    }

}
