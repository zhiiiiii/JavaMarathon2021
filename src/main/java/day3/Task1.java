package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {

            String city = in.next();

            if (city.equals("stop")) {
                break;
            }

            switch (city) {
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
                case "Rome":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                case "Liverpool":
                case "Manchester":
                case "London":
                    System.out.println("England");
                    break;
                case "Berlin":
                case "Munich":
                case "Keln":
                    System.out.println("Germany");
                    break;
                default:
                    System.out.println("Unknown country");
            }
        }
    }
}
