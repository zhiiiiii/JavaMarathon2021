package day9.Task2;

public class Triangle extends Figure {
    public double lengthOfFirst;
    public double lengthOfSecond;
    public double lengthOfThird;

    public Triangle(double lengthOfFirst, double lengthOfSecond, double lengthOfThird, String color) {
        super(color);
        this.lengthOfFirst = lengthOfFirst;
        this.lengthOfSecond = lengthOfSecond;
        this.lengthOfThird = lengthOfThird;
    }

    @Override
    public double area() {
        double p = (lengthOfFirst + lengthOfSecond + lengthOfThird) / 2;
        return Math.sqrt(p * (p - lengthOfFirst) * (p - lengthOfSecond) * (p - lengthOfThird));
    }

    @Override
    public double perimeter() {
        return lengthOfFirst+lengthOfSecond+lengthOfThird;
    }
}
