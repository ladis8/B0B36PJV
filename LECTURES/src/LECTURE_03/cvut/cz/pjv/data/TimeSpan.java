package LECTURE_03.cvut.cz.pjv.data;

/**
 * Created by ladislav on 10/03/17.
 */
public class TimeSpan {

    private int hour;
    private int minute;
    private int second;

    public TimeSpan(int hour, int minute, int second) {

            this.setTime( (hour<24)? hour:0,(minute<60)? minute:0,(second<60)? second:0);

    }

    public TimeSpan(int minute, int second) {
        this (minute/60, minute%60 + second/60, second%60);
    }

    public TimeSpan(int second) {
        this (second/60, second%60);
    }

    public TimeSpan(TimeSpan sp){ //copy constructor
        this.second = sp.second;
        this.minute = sp.minute;
        this.hour = sp.hour;
    }

    @Override
    public int hashCode() {
        return this.getTotalSeconds();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TimeSpan){
            return (((TimeSpan) obj).getTotalSeconds() == this.getTotalSeconds())? true:false;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hour);
        sb.append(" hours ");
        sb.append(minute);
        sb.append(" minutes ");
        sb.append(second);
        sb.append(" seconds");
        return sb.toString();
    }

    public TimeSpan() {
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute =minute;
        this.second = second;
    }
    public int getTotalSeconds(){
        return hour*3600 + minute*60 +second;
    }

    public TimeSpan add(int seconds){
        return new TimeSpan (this.getTotalSeconds() + seconds);
    }

}
