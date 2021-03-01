package day6;

public class Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Motorbike(int yearOfRelease, String color, String model) {
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("It is a motorbike");
    }

    public int yearDifference(int inputYear) {
        int year = Math.abs(inputYear - yearOfRelease);
        return year;
    }
}
