package edu.manipal.mit;

public class OtherClassInSamePackage {

    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();

        // private method
        superObj.privateMethod(); // cannot access

        // default method
        superObj.defaultMethod(); // can access

        // protected method
        superObj.protectedMethod(); // can access

        // public method
        superObj.publicMethod(); // can access
}
}
