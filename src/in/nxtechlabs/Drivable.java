package in.nxtechlabs;

public interface Drivable {
    public void drive();

    public default void lift(){
        System.out.println("default lift method...");
    }

}
