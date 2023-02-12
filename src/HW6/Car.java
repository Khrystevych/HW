package HW6;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String brand;
    String color;
    int price;

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", "gray", 20000);
        Car car2 = new Car("Audi", "white", 15000);
        Car car3 = new Car("Mercedes", "black", 25000);
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println(cars);
        cars.stream().filter(car -> car.color.equals("white")).forEach(System.out::println);
        cars.stream().filter(car -> car.price > 20000).forEach(System.out::println);
    }
}
