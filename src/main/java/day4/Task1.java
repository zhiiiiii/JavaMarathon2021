package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);

        System.out.println(Arrays.toString(arr));

        int oddCount = 0;
        int evenCount = 0;
        int moreThanEight = 0;
        int equalToOneCount = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8) {
                moreThanEight++;
            }

            if (arr[i] == 1) {
                equalToOneCount++;
            }

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else if (arr[i] % 2 == 1) {
                oddCount++;
            }

            sum += arr[i];
        }
        System.out.println(arr.length);
        System.out.println(moreThanEight);
        System.out.println(equalToOneCount);
        System.out.println(evenCount);
        System.out.println(oddCount);
        System.out.println(sum);
    }
}
