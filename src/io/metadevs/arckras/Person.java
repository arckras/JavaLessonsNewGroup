package io.metadevs.arckras;

public class Person {
    static String companyName;
    private String lastname;
    private String name;
    private int age;
    private double salary;

    public Person(String lastName, String name, int age, double salary) {
        this.lastname = lastName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //region getters/setters
    public String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //endregion

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        if (this.lastname == null) {
            return person.lastname == null;
        }
        boolean isLastNameEqual = this.lastname.equals(person.lastname);

        if (this.name == null) {
            return person.name == null;
        }
        boolean isNameEqual = this.name.equals(person.name);

        boolean isAgeEqual = this.age == person.age;
        return isAgeEqual && isLastNameEqual && isNameEqual;
    }

    public void comparisonAgeAndSalary() throws Exception {
        if (!isSalaryGreaterOrEqualAge()) {
            throw new Exception("Обработка забавного исключения о том, что зарплата должна быть больше или равна возрасту:");
        }
    }

    public boolean isSalaryGreaterOrEqualAge() {
        return (int) salary >= age;
    }
}
