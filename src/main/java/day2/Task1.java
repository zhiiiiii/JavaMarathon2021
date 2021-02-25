package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n>=1 && n<=4){
            System.out.println("maloetazhniy dom");
        }else if(n>=5 && n<=8){
            System.out.println("sredenetazhniy dom");
        }else if(n>=9){
            System.out.println("mnogoetazniy dom");
        }else{
            System.out.println("oshibka");
        }
    }
}
