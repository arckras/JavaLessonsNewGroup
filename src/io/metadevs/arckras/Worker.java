package io.metadevs.arckras;

public interface Worker {
    String getProfession();

    String getLastname();

    String getName();

    int getAge();

    double getSalary();

    void comparisonAgeAndSalary() throws Exception;

    default void dur() {
        System.out.println("Метод интерфейса по-умолчанию (ничего не придумалось)");
    }
}
