package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrence {
    public static void main(String[] args) {
        String input = "ilovemycountrybangladesh";
        Map<String, Long> result = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
/*output
{a=2, b=1, c=1, d=1, e=2, g=1, h=1, i=1, l=2, m=1, n=2, o=2, r=1, s=1, t=1, u=1, v=1, y=2}*/
