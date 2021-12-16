package predefineFunctionalInterface;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtils.getEmployees();

        Function<Employee, String> getEmployeeLevel = e -> {
            String level = "";
            if (e.salary > 4000D) {
                level = "high";
            }
            else if (e.salary >= 3000D) {
                level = "medium";
            }
            else {
                level = "low";
            }
            return level;
        };

        Predicate<String> isHighLevelEmployee = l -> l.equalsIgnoreCase("high");

        for (Employee employee: employees) {
            String employeeLevel = getEmployeeLevel.apply(employee);
            if (isHighLevelEmployee.test(employeeLevel)) {
                System.out.println("Name: " + employee.name);
                System.out.println("Level: " + employeeLevel);
                System.out.println();
            }
        }
    }
}
