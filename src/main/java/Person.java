public class Person {
    String name;
    String surname;
    int age;
    int height;
    String hobby;

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
