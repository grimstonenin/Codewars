package BuildACar.test;

import BuildACar.main.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {
    private Car car;

    @Test
    public void testChassisSmall() throws Exception{
        car = new Car(7,1);
        assertEquals("-o--o-'",car.chassis.component);
    }

    @Test
    public void testChassisLarge1() throws Exception{
        car = new Car(12,1);
        assertEquals("-o-o-----o-'", car.chassis.component);
    }

    @Test
    public void testChassisLarge2() throws Exception{
        car = new Car(24,1);
        assertEquals("-o-o-o-o-o-----o-o-o-o-'", car.chassis.component);
    }

    @Test
    public void testChassisLarge3() throws Exception{
        car = new Car(23,1);
        assertEquals("-o-o-o-o------o-o-o-o-'", car.chassis.component);
    }
}
