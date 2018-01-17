package BuildACar.test;

import BuildACar.main.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyTest {

    private Car car;


    @Test
    public void componentSmallWithDoorsTest(){
        try {
            car = new Car(7,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(" ____\n|  []\\\n",car.body.component);
    }
}
