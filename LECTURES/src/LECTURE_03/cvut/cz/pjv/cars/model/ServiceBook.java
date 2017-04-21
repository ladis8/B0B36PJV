package LECTURE_03.cvut.cz.pjv.cars.model;

/**
 * Created by ladislav on 10/03/17.
 */




public class ServiceBook {

    private final int capacity =10;
    private String [] serviceRecords = new String[capacity];
    private Car car;
    private int recordCount = 0;

    public ServiceBook(Car car) {
        this.car = car;
        car.setServiceBook(this);
    }
    public void addRecord(String record){
        this.serviceRecords [recordCount++] = record;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String record : serviceRecords){
            if (record!= null) {
                sb.append(record);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
