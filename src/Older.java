public class Older implements Strategy{
    @Override
    public double calculate(int month) throws Incorrect {{
        if (month < 0) {
            throw new Incorrect("month is negative :(");
        }
        if (month == 0) {
            return 0;
        }


        if(month <= 3) {
            return 100;
        }
        else{
            return 100+100*0.5;
        }
    }
}}