import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestStrategy {
    Map<String, Strategy> list_of_people = new HashMap<String, Strategy>();

    @Before public void create_list_of_people(){
        Older old = new Older();
        list_of_people.put("Sasha", old);
        Middle mid = new Middle();
        list_of_people.put("Pasha",mid);
        Youngest young = new Youngest();
        list_of_people.put("Masha", young);
    }

    @Test
    public void test1() throws Incorrect {
        create_list_of_people();
        Money m1 = new Money("Pasha",4 );
        m1.setListOfPeople(list_of_people);
        Assert.assertEquals(100+20*3, m1.executeMoney() ,0);
    }

    @Test
    public void test2() throws Incorrect {
        create_list_of_people();
        Money m1 = new Money("Sasha",5 );
        m1.setListOfPeople(list_of_people);
        Assert.assertEquals(100+100*0.5, m1.executeMoney() ,0);
    }

    @Test
    public void test3() throws Incorrect {
        create_list_of_people();
        Money m1 = new Money("Masha",10 );
        m1.setListOfPeople(list_of_people);
        Assert.assertEquals(100+50*0.1*9, m1.executeMoney() ,0);
    }

}