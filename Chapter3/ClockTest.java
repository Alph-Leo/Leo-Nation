package Chapter3;

import java.util.Scanner;

public class ClockTest {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);

        Clock aago = new Clock(2, 2, 60);

        System.out.println(aago.getHour());

        System.out.println(aago.getMinute());

        System.out.println(aago.getSecond());

    }


}
