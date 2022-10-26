//package Transport;
//public class Train extends Transport {
//    private int price;
//    private int time;
//    private String departureStation;
//    private String finalStop;
//    private int numberOfWagons;
//    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, int price, int time, String departureStation, String finalStop, int numberOfWagons) {
//        super(brand, model, productionYear, productionCountry, color, maxSpeed);
//        this.price = price;
//        this.time = time;
//        this.departureStation = departureStation;
//        this.finalStop = finalStop;
//        this.numberOfWagons = numberOfWagons;
//    }
//    @Override
//    public void refill() {
//        System.out.println("Данные о заправке " + this.getBrand() + ": " + "Нужно заправлять дизелем.");
//    }
//    public String toString() {
//        return "Бренд: " + getBrand() + ". Модель: " + getModel() + ". Год производства: " + getProductionYear() + ". Страна производства: " + getProductionCountry() + ". Цена проезда: " + getPrice() + ". Время поездки: " + getTime() + ". Станция отбытия: " + departureStation + ". Станция прибыытия: " + finalStop + ". Кол-во вагонов: " + numberOfWagons;
//    }
//    public int getPrice() {
//        return price;
//    }
//    public void setPrice(int price) {
//        this.price = price > 0 ? price : 10;
//    }
//    public int getTime() {
//        return time;
//    }
//    public void setTime(int time) {
//        this.time = time > 0 ? time : 1;
//    }
//    public String getDepartureStation() {
//        return departureStation;
//    }
//    public void setDepartureStation(String departureStation) {
//        this.departureStation = validOrDefault(departureStation, "default");
//    }
//    public String getFinalStop() {
//        return finalStop;
//    }
//    public void setFinalStop(String finalStop) {
//        this.finalStop = validOrDefault(finalStop, "default");
//    }
//    public int getNumberOfWagons() {
//        return numberOfWagons;
//    }
//    public void setNumberOfWagons(int numberOfWagons) {
//        this.numberOfWagons = numberOfWagons > 0 ? numberOfWagons : 1;
//    }
//}