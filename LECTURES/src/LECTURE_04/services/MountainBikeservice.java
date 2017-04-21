package LECTURE_04.services;

import LECTURE_04.Bicycle;
import LECTURE_04.BikeVisitor;
import LECTURE_04.MountainBike;
import LECTURE_04.RoadBike;

/**
 * Created by ladislav on 17/03/17.
 */
public class MountainBikeservice extends Basicservice implements BikeVisitor {
    @Override
    public void accept(Bicycle bike) {
        super.accept(bike);
    }

    @Override
    public void accept(MountainBike bike) {
        System.out.println("fixing mountainbike");
        bikes.add(bike);
    }

    @Override
    public void accept(RoadBike bike) {
        super.accept(bike);
    }


}
