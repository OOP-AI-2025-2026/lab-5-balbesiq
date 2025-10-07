package main.java.ua.opnu;

public class Person {
    private String surname = "Doe";
    private String name = "John";
    private int age = 0;

    public Person(String surname, String name, int age){
        if (surname != null)
            this.surname = surname;
        if (name != null)
            this.name = name;
        if (age>0 && age<100)
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return "Людина " + getSurname() + " " + getName() + ", вік: " + getAge();

    }





}