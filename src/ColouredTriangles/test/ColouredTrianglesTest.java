package ColouredTriangles.test;

import org.junit.Before;
import org.junit.Test;
import ColouredTriangles.main.*;

import static org.junit.Assert.assertEquals;

public class ColouredTrianglesTest {

    private ColouredTriangles colouredTriangles;


    @Before
    public void init() {
        colouredTriangles = new ColouredTriangles();
    }

    @Test
    public void testSingleValueCombinations() {

        assertEquals('R', colouredTriangles.triangle("RR"));
        assertEquals('G', colouredTriangles.triangle("GG"));
        assertEquals('B', colouredTriangles.triangle("BB"));
        assertEquals('R', colouredTriangles.triangle("BG"));
        assertEquals('R', colouredTriangles.triangle("GB"));
        assertEquals('G', colouredTriangles.triangle("RB"));
        assertEquals('G', colouredTriangles.triangle("BR"));
        assertEquals('B', colouredTriangles.triangle("RG"));
        assertEquals('B', colouredTriangles.triangle("GR"));

    }

    @Test
    public void testFindMissingColour() {

        assertEquals("R", colouredTriangles.findMissingColour("BG"));

    }


    @Test
    public void testMultipleValuesEvenRowNumber() {
        assertEquals('B', colouredTriangles.triangle("RGBG"));
    }

    @Test
    public void testMultipleValuesOddRowNumber() {

        assertEquals('G', colouredTriangles.triangle("RBRGBRB"));

    }
}
