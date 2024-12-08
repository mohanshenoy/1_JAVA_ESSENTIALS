package edu.manipal.mit;

public class SuperClass {

    void defaultMethod() {
            // private method
            privateMethod(); // can access

        System.out.println("inside defaultMethod!");
    }

    private void privateMethod() {
        System.out.println("inside privateMethod!");
    }

    protected void protectedMethod() {
        System.out.println("inside protectedMethod!");
    }

    public void publicMethod() {
        System.out.println("inside publicMethod!");
    }
}
