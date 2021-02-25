package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            count++;

            double x = in.nextDouble();
            double y = in.nextDouble();

            if (y == 0) {
                System.out.println("delenie na 0");
                continue;
            }

            System.out.println(x / y);
        }
    }
}
