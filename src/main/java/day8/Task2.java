package day8;


public class Task2 {
    public static void main(String[] args) {
        Airplane ap1 = new Airplane("producer1",1998,3000,3000);
        Airplane ap2 = new Airplane("producer2",1997,2000,2500);

        System.out.println(ap1.toString());
        System.out.println(ap2.toString());
    }
}
