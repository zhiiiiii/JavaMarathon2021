package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        for(int i=1; i<10; i++){
            System.out.println(i + "x" + k + "=" + (i*k));
        }
    }
}
