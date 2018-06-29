public class Person {
    String name;
    String surname;
    int age;
    int height;
    String hobby;

    public Person(String name, String surname, int age, int height, String hobby, Person person) {
        this.name = "Jan";
        this.surname = "Kowalski";
        this.age = 50;
        this.height = 180;
        this.hobby = "joga";
    }
}
