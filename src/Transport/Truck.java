package Transport;

public class Truck extends Car implements Competing {
    private Capacity capacity;
    public Truck(String brand, String model, int engineVolume, double bestLapTime, int maxSpeed, Capacity capacity) {
        super(brand, model, engineVolume, bestLapTime, maxSpeed);
    }

    @Override
    public void startMoving() {
        System.out.println(getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void finishMovement() {
        System.out.println(getBrand() + " " + getModel() + " заканчивает движение");
    }

    public String toString() {
        return "Бренд: " + getBrand() + ". Модель: " + getModel() + ". Объём двигателя: " + getEngineVolume();    }

    @Override
    public void pitStop() {
        System.out.println("Бренд: " + getBrand() + ". Модель: " + getModel() + " зашёл на Пит-стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Бренд: " + getBrand() + ". Модель: " + getModel() + ". достиг лучшего времени круга в " + getBestLapTime());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Бренд: " + getBrand() + ". Модель: " + getModel() + ". достиг максимальной скорости в " + getMaxSpeed());
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}