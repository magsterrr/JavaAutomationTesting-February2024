package HW7;

public class Ex1_Car {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "gray", 2007, 200, true);
        Car car2 = new Car("Honda", "white", true);
        Car car3 = new Car("Subaru", "black", 2020, 280);
        Car car4 = new Car("Toyota", 2007, 230, true);
        Car car5 = new Car();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
