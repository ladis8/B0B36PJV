package LECTURE_04;

import LECTURE_04.Bicycle;
import LECTURE_04.MountainBike;
import LECTURE_04.RoadBike;

/**
 * Created by ladislav on 17/03/17.
 */
public interface BikeVisitor {
    void accept(Bicycle b);
    void accept(MountainBike b);
    void accept(RoadBike b);
}
