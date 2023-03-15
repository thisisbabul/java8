package stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String input = "ilovemycountrybangladesh";
        String key = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(i -> i.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(key);
    }
}
