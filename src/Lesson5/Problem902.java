package Lesson5;

/**
 * Created by roman.girak on 08/02/2018.
 */
public class Problem902 {
//    The level of educational achievements
//    https://www.e-olymp.com/en/problems/902

//    Determine the level of educational achievements for the pupil
//    (elementary, average, sufficient, high) according to the given grade (from 1 to 12).
//    Input
//    One number that is a grade for the pupil.
//    Output
//    Print Initial for elementary level (grade from 1 to 3),
//    Average for average level (grade from 4 to 6),
//    Sufficient for sufficient level (grade from 7 to 9)
//    and High for high level (grade from 10 to 12).
    public static void main(String[] args) {
        int grade;
        grade = 19;

        if (grade >= 1 & grade <= 3) {
            System.out.println("Elementary");
        }
        else if (grade >= 4 & grade <= 6) {
            System.out.println("Average");
        }
        else if (grade >= 7 & grade <= 9) {
            System.out.println("Sufficient");
        }
        else if (grade >= 10 & grade <= 12) {
            System.out.println("High");
        }
        else {
            System.out.println("No such class exists");
        }

    }
}
