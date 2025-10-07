package main.java.ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Іван", "Іванов", 19, "CS-101", "12345");
        Student s2 = new Student("Марія", "Петренко", 20, "CS-102", "67890");

        Lecturer l1 = new Lecturer("Олександр", "Коваль", 40, "Комп'ютерні науки", 15000);
        Lecturer l2 = new Lecturer("Наталія", "Сидоренко", 35, "Математика", 12000);

        Person[] people = new Person[4];
        people[0] = s1;
        people[1] = s2;
        people[2] = l1;
        people[3] = l2;
        for (Person p : people) {
            System.out.println(p);
        }
    }
}