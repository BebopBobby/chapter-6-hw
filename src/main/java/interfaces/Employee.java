package interfaces;

public class Employee implements Comparable<Employee>, Cloneable {
    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
