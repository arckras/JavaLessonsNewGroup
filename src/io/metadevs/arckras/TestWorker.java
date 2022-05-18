package io.metadevs.arckras;

public class TestWorker {
    static Worker alex = new Manager("Менеджер", "Flow", "Alex", 20, 30);
    static Worker bob = new Person("Продавец", "Grown", "Bob", 40, 30);
    static Worker alice = new Person("Продавец", "Grown", "Alice", 40, 60);

    public static void main(String[] args) {
        System.out.println();
        getSalaryTest(alex);
        System.out.println();
        getSalaryTest(bob);
        System.out.println();
        bob.dur();
    }

    public static void getSalaryTest(Worker worker) {
        System.out.printf("Зарплата %s %sa (%s) равна: %.2f%n", worker.getLastname(), worker.getName(), worker.getProfession(), worker.getSalary());

        try {
            worker.comparisonAgeAndSalary();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.printf("%sа не радует зарплата в %s тугриков%n", worker.getName(), worker.getSalary());
        }

    }
}

