public class Youngest implements Strategy {
    @Override
    public double calculate(int month)throws Incorrect {{
        if (month < 0) {
            throw new Incorrect("month is negative :(");
        }
        if (month == 0) {
            return 0;
        }
        if(month < 1){
            return 100;
        }
        else{
            month--;
            return 100+50*0.1*month;
        }
    }
}}