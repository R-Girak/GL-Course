package Lesson15;

/**
 * Created by roman.girak on 29/03/2018.
 */
public class Main {
//    Task 1
//    Create new project called TestException.
//    Create a class Main with a main() that throws an object of class Exception inside a try block.
//    Give the constructor for Exception a String argument.
//    Catch the exception inside a catch clause and print the String argument.
//    Add a finally clause and print a message to prove you were there.

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Test");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally!!!");
        }

//    Task 2
//    Create your own exception class MyException using the extends keyword.
//    Write a constructor for this class that takes a String argument and stores it inside
//    the object with a String reference.
//    Write a method that prints out the stored string.
//    Add to method main() a try-catch clause to exercise your new exception.
//    Write a class MyTest with a method test() that throws an exception of the MyException type.
//    Try compiling it without an exception specification to see what the compiler says.
//    Add the appropriate exception specification (throws).
//    Try out your class and its exception inside a try-catch clause. Execute the program.

        MyTest m = new MyTest();
//      m.test();
        try {
            m.test();
        } catch (MyException e) {
            e.printMessage();
        }

//        Task 3
//        Create new project called ExceptionDemo.
//        Create class Main with method main().
//        Create class Person with fields firstName (of String type), lastName (String), age (int).
//        Add to class Person setters and getters for each field.
//        Create InvalidAgeException class that is subclass of RuntimeException.
//        Setter in class Person which will modify age (setAge(int ))
//        should throw InvalidAgeException when age out of range 1-120.
//        Add code to method main() to create one Pearson object and invoke setAge()
//        method with exception handling using try-catch statement Execute the program.

        Person testPerson = new Person();
        try {
            testPerson.setAge(124);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
