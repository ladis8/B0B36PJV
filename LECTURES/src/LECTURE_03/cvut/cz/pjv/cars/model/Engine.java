package LECTURE_03.cvut.cz.pjv.cars.model;



/**
 * Created by ladislav on 10/03/17.
 */
public class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Engine){
            return (this.type.equals(((Engine) obj).type))? true :false;
        }
        return false;
    }

    @Override
    public String toString() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
