package io.metadevs.arckras;

public class Person implements Worker {
    static String companyName;
    public String profession = "Seller";
    private String lastname;
    private String name;
    private int age;
    private double salary;

    public Person(String profession, String lastname, String name, int age, double salary) {
        this.profession = profession;
        this.lastname = lastname;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //region getters/setters
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    @Override
    public String getProfession() {
        return this.profession;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
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

        if (this.profession == null) {
            return person.profession == null;
        }
        boolean isProfessionEqual = this.profession.equals(person.profession);

        if (this.lastname == null) {
            return person.lastname == null;
        }
        boolean isLastnameEqual = this.lastname.equals(person.lastname);

        if (this.name == null) {
            return person.name == null;
        }
        boolean isNameEqual = this.name.equals(person.name);

        boolean isAgeEqual = this.age == person.age;
        return isAgeEqual && isLastnameEqual && isNameEqual && isProfessionEqual;
    }

    @Override
    public void comparisonAgeAndSalary() throws Exception {
        if (!isSalaryGreaterOrEqualAge()) {
            throw new Exception("Обработка забавного исключения о том, что зарплата должна быть больше или равна возрасту:");
        }
    }

    private boolean isSalaryGreaterOrEqualAge() {
        return (int) salary >= age;
    }
}
