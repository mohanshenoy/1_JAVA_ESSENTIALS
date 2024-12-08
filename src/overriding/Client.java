package overriding;

public class Client {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.findName());
    }
}
