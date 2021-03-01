package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane ap1 = new Airplane("producer1",1998,2000,2000);
        ap1.setYear(1987);
        ap1.setLength(3000);

        ap1.fillUp(200);
        ap1.fillUp(1000);

        ap1.info();
    }
}
