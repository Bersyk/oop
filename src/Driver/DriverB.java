package Driver;

import Transport.Passenger;
import Transport.Competing;

public class DriverB <T extends Passenger & Competing> extends Driver {
    public DriverB(String fullName, String license, String experience) {
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