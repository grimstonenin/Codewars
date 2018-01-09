package InterlacedSpiralCipher.test;

import InterlacedSpiralCipher.main.InterlacedSpiralCipher;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterlacedSpiralCipherTest {


    private InterlacedSpiralCipher interlacedSpiralCipher;
    private final String clearString = "ana are 1";
    private final String encodedString = "aan 1r ea";

    @Before
    public void init(){
        interlacedSpiralCipher = new InterlacedSpiralCipher();
    }


    @Test
    public void encodeTest(){
       String result =  interlacedSpiralCipher.encode(clearString);

       assertEquals(encodedString,result);

    }

    @Test
    public void decodeTest(){

        String result = interlacedSpiralCipher.decode(encodedString);

        assertEquals(clearString,result);

    }

    @Test
    public void determineCipherMatrixTest(){
        int numberOfElements = interlacedSpiralCipher.determineCipherMatrix(interlacedSpiralCipher.prepareString(clearString).length());

        assertEquals(4,numberOfElements);
    }

    @Test
    public void prepareStringTest(){
        String test = "12345678";
        String preparedString = interlacedSpiralCipher.prepareString(test);

        assertEquals("12345678 ",preparedString);
    }
}
