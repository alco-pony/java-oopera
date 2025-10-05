import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person human = (Person) o;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
