package defaultMethod;

public class Main implements Left, Right {
    @Override
    public void m1() {
        System.out.println("m1 method from Main");
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.m1();
    }
}
