package LECTURE_04.services;

import LECTURE_04.Bicycle;
import LECTURE_04.BikeVisitor;
import LECTURE_04.MountainBike;
import LECTURE_04.RoadBike;

import java.util.ArrayList;

/**
 * Created by ladislav on 17/03/17.
 */
public class Basicservice implements BikeVisitor{

    protected ArrayList<Bicycle> bikes = new ArrayList<Bicycle>();
    public void accept(Bicycle bike){
        System.out.println("fixing bicycle");
        bikes.add(bike);
    }

    @Override
    public void accept(MountainBike b) {
        System.out.println("Can not fix Mountainbike");
    }

    @Override
    public void accept(RoadBike b) {
        System.out.println("Can not fix Roadbike");
    }


}
