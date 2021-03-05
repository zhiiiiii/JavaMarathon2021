package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str += i + " ";
        }
        long finish = System.currentTimeMillis();
        System.out.println(str);
        System.out.println("Time for String class: " + (finish - start));

        StringBuilder sb = new StringBuilder("");
        long startForSB = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long finishForSb = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println("Time for StringBuilder class: " + (finishForSb - startForSB));
    }
}
