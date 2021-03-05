package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Red"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Red"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Red")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (Figure i:figures) {
            if (i.getColor().equals("Red")) {
                sum += i.perimeter();
            }
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (Figure i:figures) {
            if (i.getColor().equals("Red")) {
                sum += i.area();
            }
        }
        return sum;
    }
}
