import java.util.Objects;

public class Person {
        int age;
        String name;
        long height;

    public Person(int age, String name, long height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public long getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getHeight() == person.getHeight() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getHeight());
    }
}
