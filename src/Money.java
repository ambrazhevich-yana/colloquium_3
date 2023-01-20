import java.util.Map;

public class Money {
    private String name;
    private int month;
    private Strategy strategy;

    Money(String _name, int _month){
        name = _name;
        month = _month;
    }

    public void setListOfPeople(Map<String, Strategy> mp){
        for(Map.Entry<String, Strategy> entry: mp.entrySet()){
            if(name == entry.getKey()){
                strategy = entry.getValue();
            }
        }
    }

    public double executeMoney() throws Incorrect {
        return strategy.calculate(month);
    }
}

class Incorrect extends Exception {
    public Incorrect(String message) {
        super(message);
    }
}