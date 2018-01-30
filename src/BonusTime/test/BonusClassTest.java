package BonusTime.test;

import BonusTime.main.BonusClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusClassTest {

    private BonusClass bonusClass;

    @Before
    public void init(){
        bonusClass = new BonusClass();
    }

    @Test
    public void bonusTimeTest(){

        assertEquals("£100",bonusClass.bonusTime(100,false));
        assertEquals("£1000",bonusClass.bonusTime(100,true));

    }

}
