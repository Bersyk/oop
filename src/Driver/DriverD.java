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

    }

    @Override
    public void stop() {

    }

    @Override
    public void refill() {

    }
}
