package io.metadevs.arckras;

import java.util.ArrayList;

public class Company {
    private String fieldCompanyName;
    private ArrayList<Person> people = new ArrayList<>();

    public Company(String companyName) {
        this.fieldCompanyName = companyName;
        Person.setCompanyName(companyName);
    }

    public void hirePerson(Person person) {
        people.add(person);
    }

    public void firePerson(Person person) {
        people.remove(person);
    }

    public void printPeoples() {
        for (Person person : people) {
            printPerson(person);
        }
    }

    public static void printPerson(Person person) {
        System.out.println("Компания: " + person.companyName + ", Имя: " + person.getName() + ", Фамилия: " + person.getLastname() + ", Возраст: "
                + person.getAge() + ", Зарплата: " + person.getSalary());
    }
}
