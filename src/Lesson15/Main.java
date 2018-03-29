package Lesson15;

/**
 * Created by roman.girak on 29/03/2018.
 */
public class Main {
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

        MyTest m = new MyTest();
        try {
            m.test();
        } catch (MyException e) {
            e.printMessage();
        }
    }
}
