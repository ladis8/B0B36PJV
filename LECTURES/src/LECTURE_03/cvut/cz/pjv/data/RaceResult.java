package LECTURE_03.cvut.cz.pjv.data;

import LECTURE_03.cvut.cz.pjv.cars.model.Car;

/**
 * Created by ladislav on 10/03/17.
 */
public class RaceResult implements Comparable <RaceResult>{
    private Car car;
    private TimeSpan result;
    private int lengthofrace;

    public RaceResult(Car car, int lengthofrace) {
        this.car = car;
        this.lengthofrace = lengthofrace;
        result = new TimeSpan(lengthofrace/car.getSpeed());
    }

    public Car getCar() {return car;}
    public TimeSpan getResult() {return result;}

    @Override
    public int compareTo(RaceResult o) {
        //return this.result.getTotalSeconds() - o.result.getTotalSeconds();
        return Integer.compare(this.result.getTotalSeconds(), o.result.getTotalSeconds());
    }
}
