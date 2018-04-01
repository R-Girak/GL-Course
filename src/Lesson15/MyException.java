package Lesson15;

/**
 * Created by roman.girak on 29/03/2018.
 */
public class MyException extends Exception {
//    Create your own exception class MyException using the extends keyword.
//    Write a constructor for this class that takes a String argument and stores it
//    inside the object with a String reference.
//    Write a method that prints out the stored string.
//    Add to method main() a try-catch clause to exercise your new exception.
//    Write a class MyTest with a method test() that throws an exception of the MyException type.
//    Try compiling it without an exception specification to see what the compiler says.
//    Add the appropriate exception specification (throws).
//    Try out your class and its exception inside a try-catch clause.
//    Execute the program.

    private String message;

    MyException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
    }

}
