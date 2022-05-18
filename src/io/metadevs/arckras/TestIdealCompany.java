package io.metadevs.arckras;

public class TestIdealCompany {
    public static void main(String[] args) {
        Company macdonalds = new Company("MacDonald's");

        System.out.println();
        System.out.println("Шаг 1. Создана компания. Персонала нет.");
        macdonalds.printWorkers();

        macdonalds.hireWorker(new Person("Менеджер", "Flow", "Alice", 20, 60));
        System.out.println();
        System.out.println("Шаг 2. Найм Алисы.");
        macdonalds.printWorkers();
        TestWorker.getSalaryTest(TestWorker.alice);

        macdonalds.hireWorker(new Person("Продавец", "Grown", "Bob", 40, 30));
        System.out.println();
        System.out.println("Шаг 3. Найм Боба.");
        macdonalds.printWorkers();
        System.out.println();
        TestWorker.getSalaryTest(TestWorker.bob);

        macdonalds.fireWorker(new Person("Продавец", "Grown", "Bob", 40, 30));
        System.out.println();
        System.out.println("Шаг 4. Увольнение Боба.");
        macdonalds.printWorkers();
    }
}
