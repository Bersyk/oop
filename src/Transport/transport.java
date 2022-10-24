package Transport;
public abstract class transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private int maxSpeed;
    public transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public abstract void refill();
    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        }
        return value;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setColor(String color) {
        this.color = validOrDefault(color, "Белый");
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed > 0 ? maxSpeed : 1;
    }
}
