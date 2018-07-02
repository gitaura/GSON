import java.util.Objects;

public class Person {
    String name;
    String surname;
    int age;
    int height;
    String hobby;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                height == person.height &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(hobby, person.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, height, hobby);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public Person(String name, String surname, int age, int height, String hobby) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.hobby = hobby;
    }
}
