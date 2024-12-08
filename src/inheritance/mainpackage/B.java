package inheritance.mainpackage;

public class B extends A {

    // private int privateVar;
    // int defaultVar;
    // protected int protectedVar;
    // public int publicVar;

    public int publicVar;



    public B(int privateVar, int defaultVar, int protectedVar, int publicVar, int publicVar2) {
        super(privateVar, defaultVar, protectedVar, publicVar);
        this.publicVar = publicVar2;
        super.defaultVar = 1;
    }



    public void myMethod() {
        //this.privateVar = 1;
        this.defaultVar = 2;
        this.protectedVar = 3;
        this.publicVar = 4;
    }
}
