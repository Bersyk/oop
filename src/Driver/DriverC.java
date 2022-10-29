package Driver;

import Transport.Competing;
import Transport.Truck;

public class DriverC <T extends Truck & Competing> extends Driver{
    public DriverC(String fullName, String license, String experience) {
        super(fullName, license, experience);
    }

    public String toString(T car) {
        return "Водитель " + getFullName() + " управляет автомобилем " + car.getBrand() + " и будет участвовать в заезде";
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refill() {

    }
}