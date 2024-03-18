

public class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public int getDate() {
        return date;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    
    public void setDate(int date) {
        this.date = date;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setDate(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    @Override
    public String toString() {
        return String.format("%02d/%02d/%02d",date,month,year);
    }
}
