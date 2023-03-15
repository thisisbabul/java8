package stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Integer[] numbers = {5,8,7,9,1,3,10};
        Integer secondHighestNumber = Arrays.stream(numbers)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondHighestNumber);
    }
}
