package DuplicateEncoder.test;

import org.junit.Before;
import org.junit.Test;
import DuplicateEncoder.main.DuplicateEncoder;

import static org.junit.Assert.assertEquals;

public class DuplicateEncoderTest {

    private DuplicateEncoder duplicateEncoder;

    @Before
    public void init(){
        duplicateEncoder = new DuplicateEncoder();
    }

    @Test
    public void encodeNullOrEmptyStringTest(){
        assertEquals("",duplicateEncoder.encode(""));
    }

    @Test
    public void encodeStringWithNonRepeatingCharactersTest(){
        assertEquals("(((((((",duplicateEncoder.encode("abcdefg"));
    }

    @Test
    public void encodeStringWithRepeatingCharactersTest(){
        assertEquals("))))))(",duplicateEncoder.encode("aAbBCcd"));
    }
}
