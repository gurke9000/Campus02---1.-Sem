package prf1.klassendiagramm;

import java.util.Objects;

public abstract class Person {

    private String firstname;
    private String lastname;
    private char gender;
    private int age;
    private String country;
    private double salary;
    private String eyecolor;
    private int weight;
    private int size;

    public Person(String firstname, String lastname, char gender, int age, String country, double salary, String eyecolor, int weight, int size) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.salary = salary;
        this.weight = weight;
        this.size = size;

        switch (eyecolor)
        {
            case "grün":
            this.eyecolor = "grün";

            case "braun":
                this.eyecolor = "braun";

            case "blau":
                this.eyecolor = "blau";

            default:
                this.eyecolor = "undefiniert";
        }
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return gender == person.gender &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                weight == person.weight &&
                size == person.size &&
                Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname) &&
                Objects.equals(country, person.country) &&
                Objects.equals(eyecolor, person.eyecolor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, gender, age, country, salary, eyecolor, weight, size);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                ", eyecolor='" + eyecolor + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }
}


