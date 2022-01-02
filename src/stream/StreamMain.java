package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(6);
        nums.add(1);
        nums.add(4);
        nums.add(9);
        nums.add(5);
        System.out.println("All numbers: " + nums);

        List<Integer> evenNums = nums.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNums);

        List<Integer> increase5WithNums = nums.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println("Increase 5 with nums: " + increase5WithNums);

        Long noOf5 = nums.stream().filter(i -> i == 5).count();
        System.out.println(noOf5);

        List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNums);

        Comparator<Integer> descSorting = (i1, i2) -> (i1 < i2 ? 1 : i1 > i2 ? -1 : 0);
        List<Integer> sortedNumsByDesc = nums.stream().sorted(descSorting).collect(Collectors.toList());
        System.out.println(sortedNumsByDesc);

        List<Integer> sortedNumsDescOther = nums.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sortedNumsDescOther);

        Integer minValue = nums.stream().min(Integer::compareTo).get();
        System.out.println(minValue);

        Integer maxValue = nums.stream().max(Integer::compareTo).get();
        System.out.println(maxValue);

        List<String> actresses = new ArrayList<>();
        actresses.add("Pori Moni");
        actresses.add("Purnima");
        actresses.add("Sabana");
        actresses.add("Mousumi");
        actresses.add("Tisa");

        List<String> sortedActresses = actresses.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());
        System.out.println(sortedActresses);

        Comparator<String> byLength = (n1, n2) -> {
          Integer n1Length = n1.length();
          Integer n2Length = n2.length();
          if (n1Length < n2Length) return -1;
          else if (n1Length > n2Length) return 1;
          else return n1.compareTo(n2);
        };

        List<String> sortedByLength = actresses.stream().sorted(byLength).collect(Collectors.toList());
        System.out.println(sortedByLength);

        Stream<Integer> numbers = Stream.of(10, 30, 50, 80, 40, 20);
        numbers.forEach(System.out::println);

        Integer[] intArray = {5, 20, 30, 80, 4, 8};
        Stream.of(intArray).forEach(System.out::println);
    }
}
