public class Employee {
    public static int counter;

    private int id;

    private int department;

    private int salary;

    private String name;

    public Employee (String name, int department, int salary){
        this.name = name;
        this.department = department;
        this. salary = salary;
        id = counter;
        counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public String toString() {
        return "ФИО: " + this.name + " отдел: " + this.department + " зарплата : "
                + this.salary + " ID " + id;
    }
}
