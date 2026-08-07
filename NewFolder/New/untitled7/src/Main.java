import java.util.Objects;

class Employee {
    private static int idCounter = 1;

    private final int id;
    private String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public void printShortInfo() {
        System.out.println("Имя: " + fullName + ", зарплата: " + salary);
    }
}

class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        employees = new Employee[10];
        size = 0;
    }

    public void printAllEmployees() {
        System.out.println("=== Список всех сотрудников ===");
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public double averageSalary() {
        int count = 0;
        double sum = 0;
        for (Employee emp : employees) {
            if (emp == null) break;
            sum += emp.getSalary();
            count++;
        }
        if (count == 0) return 0;
        return sum / count;
    }

    public void calculateTax(String type) {
        double totalTax = 0;
        for (Employee emp : employees) {
            if (emp == null) break;
            double salary = emp.getSalary();
            double taxRate;
            switch (type.toUpperCase()) {
                case "PROPORTIONAL":
                    taxRate = 0.13;
                    break;
                case "PROGRESSIVE":
                    if (salary <= 150) taxRate = 0.13;
                    else if (salary <= 350) taxRate = 0.17;
                    else taxRate = 0.21;
                    break;
                default:
                    System.out.println("Неизвестный тип налога. Используйте PROPORTIONAL или PROGRESSIVE.");
                    return;
            }
            totalTax += salary * taxRate;
        }
        System.out.println("Общая сумма налогов (" + type + "): " + totalTax);
    }

    public void indexSalaryByDepartment(int department, int percent) {
        System.out.println("Индексация зарплаты в отделе " + department + " на " + percent + "%");
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            if (emp == null) break;
            if (emp.getDepartment() != department) {
                continue;
            }
            double newSalary = emp.getSalary() * (1 + percent / 100.0);
            emp.setSalary(newSalary);
        }
    }

    public void findFirstEmployeeByDepartmentAndSalary(int department, double wage) {
        System.out.println("Поиск первого сотрудника отдела " + department +
                " с зарплатой > " + wage);
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            if (emp == null) break;
            if (emp.getDepartment() == department && emp.getSalary() > wage) {
                System.out.print("Порядковый номер в списке: " + (i + 1) + ". ");
                emp.printShortInfo();
                return;
            }
        }
        System.out.println("Сотрудник не найден.");
    }

    public void findFirstEmployeesBelowSalary(double wage, int employeeNumber) {
        System.out.println("Вывод первых " + employeeNumber +
                " сотрудников с зарплатой < " + wage);
        int found = 0;
        int i = 0;
        while (i < employees.length && found < employeeNumber) {
            Employee emp = employees[i];
            if (emp == null) break;
            if (emp.getSalary() < wage) {
                System.out.print((found + 1) + ". ");
                emp.printShortInfo();
                found++;
            }
            i++;
        }
        if (found == 0) {
            System.out.println("Сотрудников с зарплатой меньше " + wage + " не найдено.");
        }
    }

    public boolean containsEmployee(Employee employee) {
        if (employee == null) return false;
        for (Employee emp : employees) {
            if (emp == null) break;
            if (emp.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public boolean addEmployee(Employee employee) {
        if (employee == null) return false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                size++;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp == null) break;
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}


public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        System.out.println("=== Добавление сотрудников ===");
        boolean added = book.addEmployee(new Employee("Иванов Иван Иванович", 1, 120.0));
        System.out.println("Добавлен Иванов: " + added);
        added = book.addEmployee(new Employee("Петрова Ольга Сергеевна", 2, 80.0));
        System.out.println("Добавлена Петрова: " + added);
        added = book.addEmployee(new Employee("Сидоров Алексей Викторович", 3, 350.0));
        System.out.println("Добавлен Сидоров: " + added);
        added = book.addEmployee(new Employee("Козлова Елена Петровна", 1, 200.0));
        System.out.println("Добавлена Козлова: " + added);
        added = book.addEmployee(new Employee("Михайлов Андрей Дмитриевич", 4, 90.0));
        System.out.println("Добавлен Михайлов: " + added);
        added = book.addEmployee(new Employee("Смирнова Татьяна Владимировна", 5, 430.0));
        System.out.println("Добавлена Смирнова: " + added);
        added = book.addEmployee(new Employee("Новиков Денис Павлович", 2, 250.0));
        System.out.println("Добавлен Новиков: " + added);
        added = book.addEmployee(new Employee("Морозова Анна Алексеевна", 3, 170.0));
        System.out.println("Добавлена Морозова: " + added);
        added = book.addEmployee(new Employee("Васильев Олег Игоревич", 1, 60.0));
        System.out.println("Добавлен Васильев: " + added);
        added = book.addEmployee(new Employee("Павлова Светлана Николаевна", 4, 300.0));
        System.out.println("Добавлена Павлова: " + added);
        added = book.addEmployee(new Employee("Зайцев Артём Сергеевич", 5, 100.0));
        System.out.println("Добавлен Зайцев (должен быть false): " + added);

        System.out.println();

        book.printAllEmployees();

        System.out.println();

        double avg = book.averageSalary();
        System.out.println("Средняя зарплата: " + avg);

        System.out.println();

        book.calculateTax("PROPORTIONAL");
        book.calculateTax("PROGRESSIVE");

        System.out.println();

        book.indexSalaryByDepartment(1, 10);
        System.out.println("После индексации:");
        book.printAllEmployees();

        System.out.println();

        book.findFirstEmployeeByDepartmentAndSalary(1, 100);

        System.out.println();

        book.findFirstEmployeesBelowSalary(200, 3);

        System.out.println();

        Employee searchEmp = new Employee("Неважно", 1, 120.0);
        System.out.println("Содержит сотрудника с зарплатой 120: " + book.containsEmployee(searchEmp));

        Employee found = book.getEmployeeById(1);
        System.out.println("Сотрудник с id=1: " + (found != null ? found.getFullName() : "не найден"));
    }
}