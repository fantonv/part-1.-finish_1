public class Main {

    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Шварцнеггер Арнольд Карлович", 1, 23542);
        employees[1] = new Employee("Немцов Борис Ефимович",2, 46745);
        employees[2] = new Employee("Джоли Анджелина Петровна",3, 23456);
        employees[3] = new Employee("Питт Бред Иванович",4, 46745);
        employees[4] = new Employee("Клинтон Билл Васильевич",5, 34563);
        employees[5] = new Employee("Рембо Джон Викторович",1, 32463);
        employees[6] = new Employee("Ведьмакова Цирилла Герольтовна",2, 46734);
        employees[7] = new Employee("Дикаприо Леонардо Леонидович",3, 56744);
        employees[8] = new Employee("Депп Джони Ефимович",4, 25623);
        employees[9] = new Employee("Ведмаков Геральт Весимирович",5, 57565);

//  вывод работяг

        withdrawEmployers();

        printSeparator();

        Employee mostPoorEmployee = searchMinSalary();
        System.out.println("Сотрудник с минимальной зарплатой: " + mostPoorEmployee);

        printSeparator();

        Employee mostRichEmployer = searchMaxSalary();
        System.out.println("Сотрудник с максимальной зарплатой: " + mostRichEmployer);

        printSeparator();

        int allSalary = getTotalSalary();
        System.out.println("Зарплатный фонд: " + allSalary);

        printSeparator();

        double mediumSalary = getMediumSalary();
        System.out.println("Средняя зарплата составляет: " + mediumSalary);

        printSeparator();

        getNameEmployers();


    }

    public static void withdrawEmployers() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void getNameEmployers() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public static int getTotalSalary() {
        int total = 0;
        for (Employee employee : employees) {
            total = total + employee.getSalary();
        }
        return total;
    }

    public static Employee searchMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee mostPoorEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                mostPoorEmployee = employee;
            }
        }
        return mostPoorEmployee;
    }

    public static Employee searchMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee mostRichEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                mostRichEmployee = employee;
            }
        }
        return mostRichEmployee;
    }

    public static double getMediumSalary(){
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null){
                count ++;
            }
        }
        if (count != 0) {
            return (double) getTotalSalary() / count;
        }
        return 0;
    }

    public static void printSeparator() {
        System.out.println("---------------------------------");
    }
}
