package LECTURE_04;

import LECTURE_04.holders.Car;
import LECTURE_04.holders.GenericCar;
import LECTURE_04.services.Basicservice;

/**
 * Created by ladislav on 17/03/17.
 */
public class Bicycle {
    protected int cadence;
    protected int gear;
    protected int speed;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public void printDescription(){
        System.out.printf("Bike is in gear %d with a cadence of %d and travelling at a speed of %d.\n", gear, cadence,speed);
    }
    public void visit(Basicservice bs){
        bs.accept(this);
    }

    public void addtoCar(Car car){
        car.accept(this);
    }
    public void addtoCar(GenericCar car){
        car.accept(this);
    }

}
