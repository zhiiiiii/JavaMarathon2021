package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public double getFuel() {
        return fuel;
    }

    public int getLength() {
        return length;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("producer: " + producer + ", year: " + year + ", length: "
                + length + ", weight: " + weight + ", fuel: " + fuel);
    }

    public int fillUp(int n) {
        return fuel += n;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("airplane 1 is longer");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("airplane 2 is longer");
        } else {
            System.out.println("equal");
        }
    }

    @Override
    public String toString() {
        return "producer: " + producer + ", year: " + year + ", length: "
                + length + ", weight: " + weight + ", fuel: " + fuel;
    }
}
