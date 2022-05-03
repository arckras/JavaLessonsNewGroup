package io.metadevs.arckras;

public class Manager implements Worker {
    static String companyName;
    private String profession = "Manager";
    private String lastname;
    private String name;
    private int age;
    private double salary;

    public Manager(String profession, String lastName, String name, int age, double salary) {
        this.profession = profession;
        this.lastname = lastName;
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
        if (!(obj instanceof Manager)) {
            return false;
        }

        Manager human = (Manager) obj;

        if (this.lastname == null) {
            return human.lastname == null;
        }
        boolean isLastNameEqual = this.lastname.equals(human.lastname);

        if (this.name == null) {
            return human.name == null;
        }
        boolean isNameEqual = this.name.equals(human.name);

        boolean isAgeEqual = this.age == human.age;
        return isAgeEqual && isLastNameEqual && isNameEqual;
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
