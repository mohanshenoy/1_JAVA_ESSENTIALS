package edu.manipal.mit;

public class SubClassInSamePackage extends SuperClass {

    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();

        // private method
        superObj.privateMethod(); // cannot access

        // default method
        superObj.defaultMethod(); // can access
        SubClassInSamePackage myObj = new SubClassInSamePackage();
        myObj.defaultMethod(); // can access

        // protected method
        superObj.protectedMethod(); // can access
        myObj.protectedMethod(); // can access

        // public method
        superObj.publicMethod(); // can access
        myObj.publicMethod(); // can access
    }
}
