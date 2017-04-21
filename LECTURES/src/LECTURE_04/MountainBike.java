package LECTURE_04;

import LECTURE_04.holders.Car;
import LECTURE_04.services.Basicservice;

/**
 * Created by ladislav on 17/03/17.
 */
public class MountainBike extends Bicycle{

    private String suspension;

    public MountainBike(int cadence, int gear, int speed, String suspension) {
        super(cadence, gear, speed);
        this.suspension= suspension;
    }

    @Override
    public void addtoCar(Car car) {
        car.accept(this);
    }

    @Override
    public void visit(Basicservice bs) {
        bs.accept(this);

    }

    @Override
    public void printDescription() {
        System.out.printf("Bike is in gear %d with a cadence of %d, suspension of %s and travelling at a speed of %d.\n", gear, cadence,suspension,speed);

    }
}
