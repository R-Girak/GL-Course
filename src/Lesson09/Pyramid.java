package Lesson09;

/**
 * Created by roman.girak on 18/03/2018.
 */
public class Pyramid {
//    Write class Pyramid with public static method printPyramid(int h) that takes parameter
//    an integer h between 1 and 9 and prints a pyramid of numbers of height h.

    public static void printPyramid(int h) {
        for (int i = 1; i < h + 1; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
