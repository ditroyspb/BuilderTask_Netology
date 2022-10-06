public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {

        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Ошибка ввода. Возраст введен некорректно.");
        }
        this.age = age;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Ошибка ввода. Не введены обязательные данные.");
        }
        Person person = new Person(name, surname, age, address);
        return person;

    }
}
