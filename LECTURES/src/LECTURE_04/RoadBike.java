package LECTURE_04;

import LECTURE_04.holders.Car;
import LECTURE_04.services.Basicservice;

/**
 * Created by ladislav on 17/03/17.
 */
public class RoadBike extends Bicycle {

    private int tireWidth;
    public RoadBike(int cadence, int gear, int speed, int tireWidth) {
        super(cadence, gear, speed);
        this.tireWidth=tireWidth;
    }
    public void visit (Basicservice bs){
        bs.accept(this);
    }
    @Override
    public void addtoCar(Car car) {
        car.accept(this);
    }

    @Override
    public void printDescription() {

        System.out.printf("Bike is in gear %d with a cadence of %d, tirewidth %d and travelling at a speed of %d.\n", gear, cadence, tireWidth,speed);
    }
}
