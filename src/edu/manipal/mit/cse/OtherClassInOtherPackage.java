package edu.manipal.mit.cse;

import edu.manipal.mit.SuperClass;

public class OtherClassInOtherPackage {

    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();

        // private method
        superObj.privateMethod(); // cannot access

        // default method
        superObj.defaultMethod(); // cannot access

        // protected method
        superObj.protectedMethod(); // cannot access

        // public method
        superObj.publicMethod(); // can access
    }
}
