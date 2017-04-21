package LECTURE_03.cvut.cz.pjv.data;

import LECTURE_03.cvut.cz.pjv.cars.model.Car;

/**
 * Created by ladislav on 10/03/17.
 */
public class CarLinkedList {

    private CarListNode head;
    private int size=0;

    public int getSize() {
        return size;
    }

    public CarLinkedList(){}

    public void addCar(Car car){
        CarListNode node = new CarListNode(car);
        if (size == 0){
            head = node;
        }
        else{
            node.setNext(head);
            head = node;
        }
        size++;
    }

    public Car[] toArray(){
        Car[] array = new Car[size];
        int counter = 0;
        CarListNode temp = this.head;

        while (temp!= null){
            array [counter] = temp.getCar();
            temp = temp.getNext();
            counter++;
        }
        return array;
    }


    public class CarListNode{



        private Car car;

        public void setNext(CarListNode next) {this.next = next;}
        public CarListNode getNext() {return next;}
        public Car getCar() {return car;}


        private CarListNode next;
        public CarListNode(Car car){
            this.car = car;
        }
    }


}


