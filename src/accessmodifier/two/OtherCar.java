package accessmodifier.two;

import accessmodifier.one.MyCar;

public class OtherCar extends MyCar {
    

    public void canSeat() {
        // this.defaultVar = 1;
        this.protectedVar = 1;
        this.publicVar = 1;
    }
    
}
