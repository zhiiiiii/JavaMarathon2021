package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setModel("Mercedes");
        car.setYearOfRelease(1997);

        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getYearOfRelease());

    }
}
