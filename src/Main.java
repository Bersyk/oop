import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.*;

public class Main{
    public static void main(String[] args) {
//        Train lastochka = new Train("Ласточка","B-901", 2011,"Россия",null, 301, 3500, 0, "Белорусский вокзал",  "Минск-Пассажирский",11);
//        Train leningrad = new Train("Ленинград","D-125", 2019,"Россия",null, 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
//        System.out.println(lastochka);
//        System.out.println(leningrad);
        Bus bus1 = new Bus("Газель", "А 410", 3, 1.2, 90, Weight.N1);
        Bus bus2 = new Bus("Икарус", "ИГ 32", 5, 1.2, 90, Weight.N1);
        Bus bus3 = new Bus("ПАЗ", "415",6, 1.2, 90, Weight.N1);
        Bus bus4 = new Bus("ПАЗ", "210",7, 1.2, 90, Weight.N1);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        bus1.startMoving();
        bus2.startMoving();
        bus3.startMoving();
        bus4.startMoving();
        bus1.finishMovement();
        bus2.finishMovement();
        bus3.finishMovement();
        bus4.finishMovement();
//        lastochka.refill();
//        bus1.refill();

        Passenger passenger1 = new Passenger("BMW", "X3", 5, 1.2, 90, TypeOfBody.SEDAN);
        Passenger passenger2 = new Passenger("Audi", "A1", 8, 1.2, 90, TypeOfBody.SEDAN);
        Passenger passenger3 = new Passenger("Toyota", "K210", 5, 1.2, 90, TypeOfBody.SEDAN);
        Passenger passenger4 = new Passenger("Lada", "95", 9, 1.2, 90, TypeOfBody.SEDAN);
        System.out.println(passenger1);
        System.out.println(passenger2);
        System.out.println(passenger3);
        System.out.println(passenger4);
        passenger1.startMoving();
        passenger2.startMoving();
        passenger3.startMoving();
        passenger4.startMoving();
        passenger1.finishMovement();
        passenger2.finishMovement();
        passenger3.finishMovement();
        passenger4.finishMovement();

        Truck truck1 = new Truck("Truck1", "1", 5, 1.1, 50, Capacity.EXTRA_LARGE);
        Truck truck2 = new Truck("Truck2", "2", 4, 2.2, 80, Capacity.EXTRA_LARGE);
        Truck truck3 = new Truck("Truck3", "3", 6, 3.3, 68, Capacity.EXTRA_LARGE);
        Truck truck4 = new Truck("Truck4", "4", 4, 1.2, 90, Capacity.EXTRA_LARGE);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        truck1.startMoving();
        truck2.startMoving();
        truck3.startMoving();
        truck4.startMoving();
        truck1.finishMovement();
        truck2.finishMovement();
        truck3.finishMovement();
        truck4.finishMovement();

        passenger1.pitStop();
        passenger1.maxSpeed();
        passenger1.bestLapTime();

        truck1.pitStop();
        truck1.maxSpeed();
        truck1.bestLapTime();

        bus1.pitStop();
        bus1.maxSpeed();
        bus1.bestLapTime();

        DriverB<Passenger> driverB = new DriverB<>("Иванов Иван Иванович","B","5 месяцев");
        System.out.println(driverB.toString(passenger1));

        DriverC<Truck> driverC = new DriverC<>("Битард Семён Попаданович","C","1 год");
        System.out.println(driverC.toString(truck1));

        DriverD<Bus> driverD = new DriverD<>("Клинок Маления Микеловнка","В","6 лет");
        System.out.println(driverD.toString(bus1));
    }
}