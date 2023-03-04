public class Person implements Comparable<Person> {

    protected String name;
    protected String surname;
    protected int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age <o.age) {
            return -1;
        } else {
            if (age > o.age) {
                return 1;
            } else {
                return name.compareTo(o.name);
            }
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }

}
