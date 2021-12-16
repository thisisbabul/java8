package predefineFunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeUtils {
    static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("babul", 5000D));
        employees.add(new Employee("anika", 4000D));
        employees.add(new Employee("sujon", 3000D));
        employees.add(new Employee("samima", 2000D));
        return employees;
    }
}
