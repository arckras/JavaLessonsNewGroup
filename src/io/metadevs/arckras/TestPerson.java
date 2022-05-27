package io.metadevs.arckras;

public class TestPerson {
    static Person alex = new Person("Flow", "Alex", 20, 30);
    static Person bob = new Person("Grown", "Bob", 40, 30);

    public static void main(String[] args) {
        Person.setCompanyName("Grow Plants");
        System.out.println();
        personTest(alex);
        System.out.println();
        personTest(bob);
    }

    private static void personTest(Person person) {
        Company.printPerson(person);
        try {
            person.comparisonAgeAndSalary();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.printf("%sа не радует зарплата в %s тугриков%n", person.getName(), person.getSalary());
        }
    }
}


