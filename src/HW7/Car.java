package HW7;

public class Car {
    private String name;
    private String colour;
    private int year;
    private int horsePower;
    private boolean secondHand;

    public Car(String name, String colour, int year, int horsePower, boolean secondHand) {
        this.name = name;
        this.colour = colour;
        this.year = year;
        this.horsePower = horsePower;
        this.secondHand = secondHand;

    }

    public Car(String name, String colour, boolean secondHand) {
        this(name, colour, -1, -1, secondHand);
    }

    public Car(String colour, int year, int horsePower, boolean secondHand) {
        this("N/A", "N/A", year, horsePower, secondHand);
    }

    public Car (String name, String colour, int year, int horsePower) {
        this(name, colour, year, horsePower, false);
    }

    public Car() {
        this("N/A", "N/A", -1, -1, false);
    }

    @Override
    public String toString() {
        return "Car{" +
               "name = '" + name + '\'' +
                " colour = '" + colour + '\'' +
                " year = '" + year + '\'' +
                " horse power = '" + horsePower + '\'' +
                " second hand = '" + secondHand + '\'' +
                '}';
    }
}


