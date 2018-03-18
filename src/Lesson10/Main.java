package Lesson10;

/**
 * Created by roman.girak on 15/03/2018.
 */
public class Main {
    public static void main(String[] args) {
        Device[] arr = {new Device(), new Monitor(), new EthernetAdapter(), new Monitor("Sony", "124500982", 145.92f, 14, 23)};

        for (Device a: arr
             ) {
            System.out.println(a.toString());
        }
    }
}
