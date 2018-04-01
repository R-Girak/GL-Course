package Lesson15;

/**
 * Created by Gerka on 01-Apr-18.
 */
public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > 120 || age < 1) {
            throw new InvalidAgeException();
        }
    }
}
