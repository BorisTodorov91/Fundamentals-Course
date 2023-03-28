package OOP.Students;

public class Person {
    private String name;
    private String lastName;
    private String age;

    public Person(String name, String lastName, String age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
   @Override
    public String toString() {
        return String.format("%s %s is %s years old", this.name, this.lastName, this.age);
    }
}
