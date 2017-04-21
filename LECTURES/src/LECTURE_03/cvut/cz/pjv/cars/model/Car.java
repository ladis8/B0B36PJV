package LECTURE_03.cvut.cz.pjv.cars.model;

import java.util.UUID;


/**
 * Created by ladislav on 10/03/17.
 */
public class Car {


    private static int NumberOfExistingCars= 0;
    private String manufacturer;
    private String modelName;
    private int year;
    private final UUID vinCode;
    private Engine engine;
    private ServiceBook serviceBook;
    private int speed;



    public static int getNumberOfExistingCars(){
        return NumberOfExistingCars;
    }

    public void setServiceBook(ServiceBook serviceBook) {
        this.serviceBook = serviceBook;
    }

    public ServiceBook getServiceBook() {
        return serviceBook;

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public UUID getVinCode() {
        return vinCode;
    }


    public int getSpeed() {
        return speed;
    }

    public Car (String manufacturer, String modelName, int year, String engine, int speed){
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        vinCode = UUID.randomUUID();
        this.engine = new Engine(engine);
        this.speed = speed;
        NumberOfExistingCars++;
    }

    @Override
    public String toString() {
            return manufacturer +" "+ modelName + " year "+year+ " "+vinCode.toString();
    }

    @Override
    public int hashCode() {
        return vinCode.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){
            if (this.vinCode.equals(((Car)obj).vinCode))
                    return true;
        }
        return false;
    }


}
