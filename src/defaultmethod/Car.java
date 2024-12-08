package defaultmethod;

public class Car implements Drivable, DrivableVehicle {
    // this wont work
    // Duplicate default methods named drive with the parameters () and () are
    // inherited from the types DrivableVehicle and Drivable Java class
}
