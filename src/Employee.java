public class Employee {
    int id;
    public String surname;
    private int salary;

    public void showId() {
        System.out.println(id);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showSalary() {
        System.out.println(salary);
    }

    Employee() {
    }

    public Employee(String surname1) {
        surname = surname1;
    }

    private Employee(int salary1) {
        salary = salary1;
    }
}
