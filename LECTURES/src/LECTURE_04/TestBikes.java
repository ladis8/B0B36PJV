package LECTURE_04;

import LECTURE_04.holders.Car;
import LECTURE_04.holders.GenericCar;
import LECTURE_04.services.Basicservice;
import LECTURE_04.services.MountainBikeservice;
import LECTURE_04.services.RoadBikeservice;

/**
 * Created by ladislav on 17/03/17.
 */
public class TestBikes {
    public static void main(String[] args) {
        Bicycle bike01, bike02, bike03;

        bike01 = new Bicycle(20, 10, 1);
        bike02 = new MountainBike(20, 10, 5, "Dual");
        bike03 = new RoadBike(40, 20, 8, 23);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();

        MountainBikeservice service = new MountainBikeservice();
        bike01.visit(service);
        bike02.visit(service);
        bike03.visit(service);
        Basicservice service2 = new RoadBikeservice();
        bike01.visit(service2);
        bike02.visit(service2);
        bike03.visit(service2);

        Basicservice service3 = new Basicservice();
        bike01.visit(service3);
        bike02.visit(service3);
        bike03.visit(service3);

        Car car = new Car();
        bike01.addtoCar(car);
        bike02.addtoCar(car);
        bike03.addtoCar(car);

        System.out.println(car);

        GenericCar car2 = new GenericCar();
        bike01.addtoCar(car2);
        bike02.addtoCar(car2);
        bike03.addtoCar(car2);
        System.out.println(car2);



    }
}
