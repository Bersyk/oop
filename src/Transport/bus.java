package Transport;

public class bus extends transport{
    public bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }
    @Override
    public void refill() {
        System.out.println("Данные о заправке " + this.getBrand() + ": " + "Можно заправлять бензином или дизелем на заправке.");
    }
    public String toString() {
        return "Бренд: " + getBrand() + ". Модель: " + getModel() + ". Год производства: " + getProductionYear() + ". Страна производства: " + getProductionCountry() + ". Цвет: " + getColor() + ". Максимальная скорость: " + getMaxSpeed();
    }
}
