package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>=b){
            System.out.println("nekkorektniy vid");
        }else{
            while(a<b){
                a++;
                if(a%5==0 && a%10!=0){
                    System.out.print(a + " ");
                }
            }
        }
    }
}
