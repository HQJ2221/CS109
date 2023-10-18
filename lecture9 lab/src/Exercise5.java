import java.util.ArrayList;
public class Exercise5 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("LL", "Maay"));
        employees.add(new Employee("Ming", "Li"));
        employees.add(new Employee("Mei", "Han"));
        employees.add(new Employee("Qiang", "Wang"));
        employees.add(new Employee("San", "Zhang"));

        for (Employee employee : employees) {
            System.out.printf("No.%d Employee: %s %s\n", employee.id, employee.getFirstName(), employee.getLastName());
        }
        System.out.println("The count of Employee objects are:" + Employee.getCount());
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private static int count = 0;
    int id;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
        id = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getCount() {
        return count;
    }
}