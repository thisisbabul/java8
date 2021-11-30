package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);
        list.add(30);
        list.add(25);

        System.out.println(list);
        //Collections.sort(list, new MyComparator());
        Comparator<Integer> comparator = (a, b) -> a < b ? -1 : a > b ? 1 : 0;
        Collections.sort(list, comparator);
        list.stream().forEach(System.out::println);

        List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);
    }
}
