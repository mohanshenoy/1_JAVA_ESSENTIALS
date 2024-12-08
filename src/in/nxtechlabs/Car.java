package in.nxtechlabs;

public class Car {

    int wheels=2;
    public int seats;
    double weight;
    static double topSpeed=200;
    final boolean STATUS = true;

    public Car(){
        this.wheels = 2;
        //this.STATUS = false;
    }
    public Car(int seats) {
        this();
        this.seats = seats;
    }
    public Car(int seats,double weight) {
        this(seats);
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Car [wheels=" + wheels + 
        ", seats=" + seats + 
        ", weight=" + weight + 
        ", topSpeed=" + topSpeed + "]";
    }

    public static void myStaticMethod(){
        System.out.println("inside myStaticMethod");
        myStaticMethod2();
    }
    public static void myStaticMethod2(){
        System.out.println("inside myStaticMethod2");
    }
    public void myObjMethod(){
        System.out.println("inside myObjMethod");
       
    }

    public static class Wheel {
        public void myMethod(){
            System.out.println("inside Wheel.myMethod method");
        }
    }

    public class Chasis {
        public void myMethod(){
            System.out.println("inside Chasis.myMethod method");
        }
    }

    public boolean isTwoSeater(){
        return seats == 2;
    }
}
