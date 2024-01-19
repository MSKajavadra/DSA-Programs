//02-02-2023 (Thursday)
public class OOPProg1 {
    public static void main(String[] args) {
        Holiday h[]=new Holiday[5];
        h[0]=new Holiday("Holi",12,"March");
        h[1]=new Holiday("Janmashtami",16,"August");
        h[2]=new Holiday("Uttarayan",14,"January");
        h[3]=new Holiday("Rakhshbandhan",4,"August");
        h[4]=new Holiday("Shivratri",18,"February");
        System.out.println("Is Month Same?: " + h[0].isSameMonth(h[1]));
        System.out.println("Average of Date: " + Holiday.avgDate(h));

        Holiday holiday=new Holiday("Independence Day",4,"July");


    }
}
class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public Boolean isSameMonth(Holiday h2){
        if(month.equals(h2.month)){
            return true;
        }
        return false;
    }
    public static Double avgDate(Holiday[] holiday){
        double sum=0;
        for(int i=0;i<holiday.length;i++){
            sum+=holiday[i].getDay();
        }
        double avg=sum/holiday.length;
        return avg;
    }
}

