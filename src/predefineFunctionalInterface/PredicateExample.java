package predefineFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println(isEven.test(10));

        Predicate<Employee> isSalaryGreaterThan3000 = e -> e.salary > 3000;
        List<Employee> employees = EmployeeUtils.getEmployees();

        for (Employee employee: employees) {
            if (isSalaryGreaterThan3000.test(employee)) {
                System.out.println(employee);
            }
        }

        Integer[] numbers = {1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        Predicate<Integer> isGreaterThan10 = i -> i > 10;

        for (Integer num: numbers) {
            /*if (isEven.and(isGreaterThan10).test(num)) {
                System.out.println(num);
            }
            if (isEven.or(isGreaterThan10).test(num)) {
                System.out.println(num);
            }*/
            if (isEven.negate().test(num)) {
                System.out.println(num);
            }
        }
    }
}
