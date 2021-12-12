package customObj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> employeeComparableList = new ArrayList<>();
        employeeComparableList.add(new Employee(1L, "Babul1"));
        employeeComparableList.add(new Employee(3L, "Babul3"));
        employeeComparableList.add(new Employee(4L, "Babul4"));
        employeeComparableList.add(new Employee(2L, "Babul2"));
        System.out.println(employeeComparableList);
        Collections.sort(employeeComparableList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(employeeComparableList);
    }
}
