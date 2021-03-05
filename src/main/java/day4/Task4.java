package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int numbers[] = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        int sumMax = 0;
        int sumMaxIndex = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += numbers[j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                sumMaxIndex = i;
            }

        }
        System.out.println(sumMax);
        System.out.println(sumMaxIndex);
    }
}
