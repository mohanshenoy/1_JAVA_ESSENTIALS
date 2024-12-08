package nestedclass.anonymous;

public class Client {
    public static void main(String[] args) {
        Car car = new Car() {
            public boolean isTwoSeater() {
                return seats >= 2;
            }
        };
        System.out.println(car.isTwoSeater());

    }
}
