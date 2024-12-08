package nestedclass.localclass;

public class Client {

    public static void main(String[] args) {
        int i = 333;

        class Car {
            private int diameter = i;
            int getDiameter() {
                return diameter;
            }
            void setDiameter(int diameter) {
                this.diameter = diameter;
            }
        }
        Car car = new Car();
        car.setDiameter(9999);
        System.out.println(car.getDiameter());
        i = 35; // this wont work !
    }

}
