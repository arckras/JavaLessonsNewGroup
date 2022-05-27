package io.metadevs.arckras;

public class TestCompany {
    public static void main(String[] args) {
        Company teapots = new Company("Teapots");

        System.out.println();
        System.out.println("Шаг 1. Создана компания. Персонала нет.");
        teapots.printPeoples();

        teapots.hirePerson(new Person("Flow", "Alice", 20, 30));
        System.out.println();
        System.out.println("Шаг 2. Найм Алисы.");
        teapots.printPeoples();

        teapots.hirePerson(new Person("Grown", "Bob", 40, 60));
        System.out.println();
        System.out.println("Шаг 3. Найм Боба.");
        teapots.printPeoples();

        teapots.firePerson(new Person("Grown", "Bob", 40, 60));
        System.out.println();
        System.out.println("Шаг 4. Увольнение Боба.");
        teapots.printPeoples();
    }
}
