package OPPE2;
class Date {
    private int date,month,year;
    Date(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        return "Date[Date="+date+",Month="+month+",Year="+year+"]";
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Date d1 = new Date(23,01,2024);
        System.out.println(d1.toString());
    }
    
}
