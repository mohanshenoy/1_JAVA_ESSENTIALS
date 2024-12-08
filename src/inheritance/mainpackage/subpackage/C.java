package inheritance.mainpackage.subpackage;

import inheritance.mainpackage.A;

public class C extends A {

    // private int privateVar;
    // int defaultVar;
    // protected int protectedVar;
    // public int publicVar;

    public int q;

    public C(int privateVar, int defaultVar, int protectedVar, int publicVar, int q) {
        super(privateVar, defaultVar, protectedVar, publicVar);
        this.q = q;
    }

    public void myMethod() {
        // this.privateVar = 1;
        //this.defaultVar = 2;
        this.protectedVar = 3;
        this.publicVar = 4;
    }
}
