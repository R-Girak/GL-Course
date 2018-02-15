package Lesson5;

/**
 * Created by roman.girak on 14/02/2018.
 */
public class Problem126 {
//    Number of an apartment
//    https://www.e-olymp.com/en/problems/126
//
//    Многоквартирный дом имеет N квартир, P подъездов и Q этажей,
//    причем на каждом этаже каждого подъезда имеется одинаковое количество квартир.
//    Определить в каком подъезде и на каком этаже находится квартира с заданным номером K.
//    Входные данные
//    В единственной строке файла записаны значения N, P, Q, K. 1 ≤ K ≤ N ≤ 1000, P*Q ≤ N.
//    Выходные данные
//    В единственную строку файла нужно вывести номер подъезда и этаж, на котором находится квартира с номером K.

    public static void main(String[] args) {
        int q = 10;
        int p = 2;
        int f = 4; // No of appts on each floor
        int n = q*p*f; // No of appts in the building

        int k = 70; // No of appt to find

        if (k > n) {
            System.out.println("No such appartment in this building");
        }
        else {
            int sectionNo = (k /(q*f));
            int floorNo = (k - sectionNo*q*f) / f;
            System.out.println("Section no.: " + (sectionNo + 1));
            System.out.println("Floor no.: " + (floorNo + 1));
        }
    }
}
