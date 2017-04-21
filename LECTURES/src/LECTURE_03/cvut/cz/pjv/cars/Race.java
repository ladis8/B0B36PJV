package LECTURE_03.cvut.cz.pjv.cars;

import LECTURE_03.cvut.cz.pjv.cars.model.Car;
import LECTURE_03.cvut.cz.pjv.data.CarLinkedList;
import LECTURE_03.cvut.cz.pjv.data.RaceResult;
import LECTURE_03.cvut.cz.pjv.data.TimeSpan;
import LECTURE_03.cvut.cz.pjv.utils.ArrayUtil;


/**
 * Created by ladislav on 10/03/17.
 *
 * V balíčku LECTURE_03.cvut.cz.pjv.cars implementujte třídu Race představující automobilový závod.
 * Závod bude mít jako povinný parametr délku trasy length.
 * Závod bude mít neomezený počet startovních pozic (využijte spojový seznam).
 * Metodou addRacingCar(Car car) se přidá vůz na první volnou startovní pozici.
 * Metodá vrátí true při úspěchu a false v případě, že závod již odstartoval.
 * Implementujte metody getWinner() a getWinningTime(), které vrátí instanci vyhrávajícího auta, resp. čas jeho jízdy.
 * V případě stejných časů bude výsledkem jedno z aut. Zajistěte, že výpočet výherce proběhne pouze jednou
 * a bude cashován uvnitř třídy. Využijte pomocnou metodu getRaceResults() vracející pole RaceResult (párů auto-čas).
 * Spojový seznam aut nejprve převeďte na pole.
 * Při výpočtu času jízdy předpokládejte zjednodušenou situaci,
 * kdy každé auto se od startu až po cíl (length) pohybuje konstantní rychlostí speed.
 */
public class Race extends ArrayUtil{

    private int length;
    private CarLinkedList competitiors;


    private boolean alreadyStarted = false;
    private Car winner;
    private TimeSpan winningTimeSpan;
    private RaceResult [] results;


    public Race(int length){
        this.length = length;
        competitiors = new CarLinkedList();

    }
    public boolean addRacingCar(Car car){
        if (!alreadyStarted){
            this.competitiors.addCar(car);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (results !=null){
            for (RaceResult carresult: this.results){
                sb.append(carresult.getCar());
                sb.append("\n");
            }
        }
        else{
            for (Car car :competitiors.toArray()){
                sb.append(car);
                sb.append("\n");
            }
        }


        return sb.toString();
    }

    private void getRaceResults(){

        if (competitiors.getSize() != 0){

            //race has started
            alreadyStarted = true;

            //init the race results table
            results = new RaceResult[competitiors.getSize()];
            int counter =0;
            for (Car car :competitiors.toArray()){
                results [counter++] = new RaceResult(car,this.length);
            }

            //sorting results (in the superclass x it does not make sense)
            //Arrays.sort(results);
            super.sort(results);
            winner = results[0].getCar();
            winningTimeSpan = results[0].getResult();

        }
        else
            System.out.println("Race is empty!!!\n");

    }

    public TimeSpan getWinningTime(){

        if (!alreadyStarted){
            getRaceResults();
        }
        return winningTimeSpan;
    }

    public Car getWinner(){

        if (!alreadyStarted){
            getRaceResults();
        }
        return winner;
    }
}
