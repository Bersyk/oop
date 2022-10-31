package Transport;

public class Bus extends Transport implements Competing {
    private Weight weight;
    public Bus(String brand, String model, int engineVolume, double bestLapTime, int maxSpeed, Weight weight) {
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

    //    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//    }
//    @Override
//    public void refill() {
//        System.out.println("Данные о заправке " + this.getBrand() + ": " + "Можно заправлять бензином или дизелем на заправке.");
//    }
    public String toString() {
        return "Бренд: " + getBrand() + ". Модель: " + getModel() + ". Объём двигателя: " + getEngineVolume();
    }

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

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}
