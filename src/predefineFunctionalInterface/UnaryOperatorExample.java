package predefineFunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> squareIt = n -> n * n;
        System.out.println(squareIt.apply(5));
    }
}
