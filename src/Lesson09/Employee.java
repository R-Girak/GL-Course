package Lesson09;

/**
 * Created by roman.girak on 18/03/2018.
 */
public class Employee {
    //    3.1 Create class Employee with fields firsName, lastName, telephone and static field numberOfEmployees.
    //    3.2 Class must have constructor, which will initialize class fields and increment numberOfEmployees.
    //    3.3 Create multiple instances of Employee class and the output numberOfEmployees field to console.

    String firsName, lastName, telephone;
    static int numberOfEmployees;

    public Employee(String firsName, String lastName, String telephone) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.telephone = telephone;

        numberOfEmployees++;
    }
}
