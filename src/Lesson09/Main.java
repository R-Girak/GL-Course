package Lesson09;

/**
 * Created by roman.girak on 18/03/2018.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, -7, 4, 14, 2, 5};

        Math a = new Math();

        System.out.println(a.findMin(arr));
        System.out.println(a.findMax(arr));

        System.out.println(a.areaOfCircle(2.8));

        Employee e1 = new Employee("F", "L", "033");
        Employee e2 = new Employee("F", "L", "033");
        System.out.println("Number Of Employees: " + e1.numberOfEmployees);

        Calculator c = new Calculator();
        System.out.println(c.calcPi(1116));

        Pyramid p = new Pyramid();
        p.printPyramid(8);

    }
}
