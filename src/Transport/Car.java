package Transport;

import Transport.transport;

import java.time.LocalDate;

public class Car extends transport {

    //ПЕРЕМЕННЫЕ

    private double engineVolume;

    private String gearBox;

    private String bodyType;

    private String regNumber;

    private int placesCount;

    private boolean winterTires;

    //КОНСТРУКТОР
    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double engineVolume, String gearBox, String bodyType, String regNumber, int placesCount, boolean winterTires) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.gearBox = gearBox;
        this.bodyType = bodyType;
        this.regNumber = regNumber;
        this.placesCount = placesCount;
        this.winterTires = winterTires;
    }

    //МЕТОДЫ
    public String toString() {
        return "Бренд: " + getBrand() + ". Модель: " + getModel() + ". Объём двигателя: " + engineVolume + ". Цвет: " + getColor() + ". Год производства: " + getProductionYear() + ". Страна производства: " + getProductionCountry() + ". Тип коробки передач: " + gearBox + ". Тип кузова: " + bodyType + ". Регистрационный номер: " + regNumber + ". Кол-во мест: " + placesCount + ". Зимняя резина: " + winterTires;
    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;
    }

    public boolean isRegNumberValid() {
        if (this.regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }

    //ГЕТТЕРЫ И СЕТТЕРЫ
    public String getBodyType() {
        return bodyType;
    }

    public int getPlacesCount() {
        return placesCount;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0.0 ? engineVolume : 1.5;
    }


    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = validOrDefault(gearBox, "default");
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = validOrDefault(regNumber, "default");
    }

    public boolean isWinterTires() {
        return winterTires;
    }
}