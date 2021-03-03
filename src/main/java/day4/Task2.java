package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int numbers[] = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        int max = numbers[0];
        int min = numbers[0];
        int zeroCount = 0;
        int sum = 0;
        for (int i : numbers) {
            if (i > max)
                max = i;
            else if (i < min)
                min = i;

            if (i % 10 == 0) {
                zeroCount++;
                sum += i;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(zeroCount++);
        System.out.println(sum);

    }
}
