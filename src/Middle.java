public class Middle implements Strategy{
    @Override
    public double calculate(int month) throws Incorrect {{
        if (month < 0) {
            throw new Incorrect("month is negative :(");
        }
        if (month == 0) {
            return 0;
        }
        if(month < 2){
            return 100;
        }
        else{
            month--;
            return 100+20*month;
        }
    }
}}