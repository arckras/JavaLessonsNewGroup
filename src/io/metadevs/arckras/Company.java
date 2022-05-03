package io.metadevs.arckras;

import java.util.ArrayList;

public class Company implements IdealCompany {
    private String fieldCompanyName;
    private ArrayList<Worker> peoples = new ArrayList<>();

    public Company(String companyName) {
        this.fieldCompanyName = companyName;
        Person.setCompanyName(companyName);
    }

    @Override
    public void hireWorker(Worker human) {
        peoples.add(human);
    }

    @Override
    public void fireWorker(Worker human) {
        peoples.remove(human);
    }

    public void printWorkers() {
        for (Worker human : peoples) {
            printWorker(human);
        }
    }

    public static void printWorker(Worker human) {
        System.out.println("Должность: " + human.getProfession() + ", Имя: " + human.getName() + ", Фамилия: " + human.getLastname() + ", Возраст: "
                + human.getAge() + ", Зарплата: " + human.getSalary());
    }
}
