package LECTURE_04.holders;

import LECTURE_04.Bicycle;
import LECTURE_04.MountainBike;
import LECTURE_04.RoadBike;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ladislav on 17/03/17.
 */
public class GenericCar <T extends Bicycle> {
    List<BicycleHolder> carHolders = new ArrayList<BicycleHolder>(4);

    public void accept(T bike){
        carHolders.add(new BicycleHolder(bike));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (BicycleHolder h: carHolders){
            sb.append(h.bicycle.getClass());
        }
        return sb.toString();
    }
}
