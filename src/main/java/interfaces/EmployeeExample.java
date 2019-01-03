package interfaces;

public class EmployeeExample {
    private String name;
    private double salary;

    public EmployeeExample(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject, 0 if the salaries are the same, a positive value otherwise
     */
    public int compareTo(Employee other)
    {
        if (getClass() != other.getClass()) throw new ClassCastException();
        return Double.compare(salary, other.salary);
    }
}
