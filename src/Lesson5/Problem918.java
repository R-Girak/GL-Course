package Lesson5;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem918 {
//    Which quarter?
//    https://www.e-olymp.com/en/problems/918
//
//    It set a point with co-ordinates х and y. Define, in what co-ordinate quarter it is located.
//    Input
//    In a unique line through a blank 2 material numbers - co-ordinates of a point are set, value of co-ordinates on the module do not exceed 100.
//    Output
//    The singular is the number of a corresponding quarter, or 0 if unequivocally define a quarter it is impossible.

    public static void main(String[] args) {
        int x = -10;
        int y = 10;

        if (x >= 0 && y >= 0) {
            System.out.println("First quarter");
        }
        if (x >= 0 && y < 0) {
            System.out.println("Second quarter");
        }
        if (x < 0 && y < 0) {
            System.out.println("Third quarter");
        }
        if (x < 0 && y >= 0) {
            System.out.println("Fourth quarter");
        }
    }
}
