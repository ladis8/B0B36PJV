package LECTURE_04.holders;

import LECTURE_04.Bicycle;
import LECTURE_04.BikeVisitor;
import LECTURE_04.MountainBike;
import LECTURE_04.RoadBike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ladislav on 17/03/17.
 */
public class Car implements BikeVisitor{
    List<BicycleHolder> carHolders = new ArrayList<BicycleHolder>(4);

    public void accept(Bicycle bike){
        carHolders.add(new BicycleHolder(bike));
    }
    public void accept (MountainBike bike){
        carHolders.add(new MountainBikeHolder(bike));
    }
    public void accept (RoadBike bike){
        carHolders.add(new RoadBikeHolder(bike));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BicycleHolder h: carHolders){
            sb.append(h.getClass());
        }
        return sb.toString();
    }
}
