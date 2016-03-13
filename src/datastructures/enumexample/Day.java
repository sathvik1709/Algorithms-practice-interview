package datastructures.enumexample;

/**
 * Created by Sathvik on 12/02/16.
 */
public enum Day {

    SUNDAY (10,20,2015),
    MONDAY (10,21,2015),
    TUESDAY (10,22,2015),
    WEDNESDAY (10,23,2015),
    THURSDAY (10,24,2015),
    FRIDAY (10,25,2015),
    SATURDAY (10,26,2015);

    int date;
    int month;
    int year;

    Day(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date is "+month+"/"+date+"/"+year;
    }
}
