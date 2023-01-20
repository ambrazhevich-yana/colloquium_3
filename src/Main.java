import java.util.HashMap;
import java.util.Map;


public class Main {
    static Map<String, Strategy> list_of_people = new HashMap<String, Strategy>();

    public static void create_list_of_people(){
        Older old = new Older();
        list_of_people.put("Sasha", old);
        Middle mid = new Middle();
        list_of_people.put("Pasha",mid);
        Youngest young = new Youngest();
        list_of_people.put("Masha", young);

    }

    public static void main(String[] args) throws Incorrect {
        System.out.println("Hello world!");
        create_list_of_people();
        Money m = new Money("Pasha", 4);
        m.setListOfPeople(list_of_people);
        System.out.println(m.executeMoney());
        Money m2 = new Money("Sasha", 0);
        m2.setListOfPeople(list_of_people);
        System.out.println(m2.executeMoney());
    }
}