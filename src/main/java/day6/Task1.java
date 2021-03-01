package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setModel("Mercedes");
        car.setYearOfRelease(1997);

        Motorbike motorbike = new Motorbike(1998, "black", "model");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(1977));
        System.out.println(motorbike.yearDifference(1908));
    }
}
