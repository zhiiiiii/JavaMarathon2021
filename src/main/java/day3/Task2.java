package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            double x = in.nextDouble();
            double y = in.nextDouble();

            if (y == 0) {
                break;
            }

            System.out.println(x / y);
        }
    }

}
