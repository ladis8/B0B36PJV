package LECTURE_03.cvut.cz.pjv.cars.model;

import LECTURE_03.cvut.cz.pjv.cars.Race;
import LECTURE_03.cvut.cz.pjv.data.TimeSpan;

/**
 * Created by ladislav on 10/03/17.
 */
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Volkswagen", "Polo", 2010, "AKK",40);
        ServiceBook serviceBook1 = new ServiceBook(car1);
        serviceBook1.addRecord("První servisní prohlídka.");
        System.out.println(car1);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
        System.out.printf("Servisní záznamy %s %s:\n%s\n", car1.getManufacturer(), car1.getModelName(), car1.getServiceBook());
        Car car2 = new Car("Chevrolet", "Corvette", 1980, "LS7",50);
        ServiceBook serviceBook2 = new ServiceBook(car2);
        serviceBook2.addRecord("První servisní prohlídka.");
        serviceBook2.addRecord("Porucha motoru.");
        System.out.println(car2);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
        System.out.printf("Servisní záznamy %s %s:\n%s\n", car2.getManufacturer(), car2.getModelName(), car2.getServiceBook());
        System.out.println();

        TimeSpan t1 = new TimeSpan(0, 0, 130);
        System.out.println("T1: " + t1);
        t1 = new TimeSpan(130);
        System.out.println("T1: " + t1);
        TimeSpan t2 = new TimeSpan(t1).add(70);
        System.out.println("T1: " + t1);
        System.out.println("T2: " + t2);
        System.out.printf("Časy se %s.\n", t1.equals(t2) ? "rovnají" : "nerovnají");
        t1 = t1.add(70);
        System.out.println("T1: " + t1);
        System.out.println("T2: " + t2);
        System.out.printf("Časy se %s.\n", t1.equals(t2) ? "rovnají" : "nerovnají");

        System.out.println();
        car1 = new Car("Volkswagen", "Polo", 2010, "AKK", 40);
        car2 = new Car("Chevrolet", "Corvette", 1980, "LS7", 45);

        Car car3 = new Car("Trabant", "P601", 1990, "Air cooled, 0.6-liter 2-stroke", 20);
        Car car4 = new Car("BMW", "3", 2006, "318d", 42);
        Car car5 = new Car("McLaren", "F1", 2014, "V12", 107);
        Race race = new Race(1000);
        race.addRacingCar(car1);
        race.addRacingCar(car2);
        race.addRacingCar(car3);
        race.addRacingCar(car4);
        race.addRacingCar(car5);
        System.out.println("Závodníci:");
        System.out.println(race);
        System.out.printf("Výhercem se stává %s s časem %s.\n", race.getWinner(), race.getWinningTime());
        System.out.printf("Pořadí v cíli:\n%s\n", race);


    }


}
