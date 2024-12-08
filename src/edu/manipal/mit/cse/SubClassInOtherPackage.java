package edu.manipal.mit.cse;

import edu.manipal.mit.SuperClass;

public class SubClassInOtherPackage extends SuperClass {

    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();

        // private method
        superObj.privateMethod(); // cannot access

        // default method
        superObj.defaultMethod(); // cannot access
        SubClassInOtherPackage myObj = new SubClassInOtherPackage();
        myObj.defaultMethod(); // cannot access

        // protected method
        superObj.protectedMethod(); // cannot access
        myObj.protectedMethod(); // can access

        // public method
        superObj.publicMethod(); // can access
        myObj.publicMethod(); // can access
    }
}
