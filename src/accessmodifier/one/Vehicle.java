package accessmodifier.one;

public class Vehicle extends MyCar{
    
    public void canSeat(){
        this.defaultVar = 1;
        this.protectedVar = 1;
        this.publicVar = 1;
    }
}
