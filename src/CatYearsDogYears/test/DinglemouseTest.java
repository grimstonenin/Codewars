package CatYearsDogYears.test;

import CatYearsDogYears.main.Dinglemouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DinglemouseTest {

    private Dinglemouse dinglemouse;

    @Before
    public void init(){
        dinglemouse = new Dinglemouse();
    }

    @Test
    public void ownedCatAndDogInvalidArgumentsTest(){

        int[] years = dinglemouse.ownedCatAndDog(0,0);

        assertArrayEquals(new int[]{0,0},years);
    }

    @Test
    public void ownedCatAndDowOneYear(){

        int[] years = dinglemouse.ownedCatAndDog(15,15);

        assertArrayEquals(new int[]{1,1},years);
    }

    @Test

    public void ownedCatAndDogTwoYears(){

        int[] years = dinglemouse.ownedCatAndDog(24,24);

        assertArrayEquals(new int[]{2,2},years);

    }

    @Test
    public void ownedCatAndDogRealTest(){
        int[] years = dinglemouse.ownedCatAndDog(32,34);

        assertArrayEquals(new int[]{4,4},years);

    }

    @Test
    public void ownedCatAndDogRandomTest(){
        int[] years = dinglemouse.ownedCatAndDog(49,68);

        assertArrayEquals(new int[]{8,10},years);

    }
}
