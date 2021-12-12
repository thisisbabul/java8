package defaultMethod;

public interface Right {
    default void m1() {
        System.out.println("m1 method from Right");
    }
}
