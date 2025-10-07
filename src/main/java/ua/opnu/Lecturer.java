package main.java.ua.opnu;

public class Lecturer extends Person{
    private String department;
    private int salary;

    public Lecturer(String name, String surname, int age, String department, int salary) {
        super(surname, name, age);
        this.department = "null";
        this.salary = -1;

    if(department!=null)
        this.department = department;
    if(salary>0)
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Викладач кафедри " + getDepartment() + ", " + getSurname() + " " + getName() +
                ", вік: " + getAge() + ". Зарплата: " + getSalary();
    }
}