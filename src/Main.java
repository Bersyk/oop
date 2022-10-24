import Transport.Car;
import Transport.bus;
import Transport.train;
import Transport.transport;

public class Main{
    public static void main(String[] args) {
        train lastochka = new train("Ласточка","B-901", 2011,"Россия",null, 301, 3500, 0, "Белорусский вокзал",  "Минск-Пассажирский",11);
        train leningrad = new train("Ленинград","D-125", 2019,"Россия",null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);
        bus bus1 = new bus("Газель", null, 2000, "Россия", "Белый",80);
        bus bus2 = new bus("Икарус", null, 1999, "Россия","Красный", 70);
        bus bus3 = new bus("ПАЗ", "410", 1985, "Россия","Серый", 60);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        lastochka.refill();
        bus1.refill();
    }
}
