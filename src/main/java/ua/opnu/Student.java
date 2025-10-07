package main.java.ua.opnu;

public class Student extends Person{
    private String group;
    private String studTicket;

    public Student(String name, String surname, int age, String group, String studTicket) {
        super(surname, name, age);
        this.studTicket = "null";
        this.group = "null";

        if (group != null)
            this.group = group;
        if (studTicket != null)
            this.studTicket = studTicket;
    }

    public String getGroup() {
        return group;
    }

    public String getStudTicket() {
        return studTicket;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setStudTicket(String studTicket) {
        this.studTicket = studTicket;
    }

    public String toString(){
        return "Студент групи " + getGroup() + ", " + getSurname() + " " + getName() +
                ", вік: " + getAge() + ". Номер студентського квитка: " + getStudTicket();
    }
}