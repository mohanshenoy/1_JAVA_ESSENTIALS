package constructorcalls;

public class C extends B {

    public C(int i) {
        super(i);
        System.out.println("C Arg Constructor called....");
    }

    public void myMethod() {
        System.out.println("C myMethod called....");
    }
}
