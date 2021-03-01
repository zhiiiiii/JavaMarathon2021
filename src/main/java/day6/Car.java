package day6;

public class Car {
    private int yearOfRelease;
    private String color;
    private String model;

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("It is a car");
    }

    public int yearDifference(int inputYear) {
        int year = Math.abs(inputYear - yearOfRelease);
        return year;
    }
}
