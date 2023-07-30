import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer(1, "Omar", 30, 20));
        employees.add(new Developer(2, "Ahmad", 20, 15));
        employees.add(new Intern(3, "Ali", 25, 0));
        employees.add(new Intern(4, "mohammad", 22, 0));


        for (Employee employee : employees) {
            if(employee.getClass().isAnnotationPresent(NotPaid.class))
            {
                System.out.println("Employee :  " + employee.getName() + " is not paid");
            }
            else
            {
                System.out.println("Employee :  " + employee.getName() +
                        " is paid : " + employee.calculateSalary(10.0));
            }

        }


    }
}