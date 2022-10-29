package Driver;

import Transport.Competing;
import Transport.Bus;

public class DriverD <T extends Bus & Competing> extends Driver{
    public DriverD(String fullName, String license, String experience) {
        super(fullName, license, experience);
    }

    public String toString(T car) {
        return "Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + " и будет участвовать в заезде";
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель " + getFullName() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель " + getFullName() + " заканчивает движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель " + getFullName() + " заправляет автомобиль");
    }
}
