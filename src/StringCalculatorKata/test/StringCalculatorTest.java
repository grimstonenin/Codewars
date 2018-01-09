package StringCalculatorKata.test;

import StringCalculatorKata.main.StringCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void init(){

         calculator = new StringCalculator();

    }


    @Test
    public void addTestWithZeroString() throws Exception {

        String s = "";
        assertEquals(0,calculator.add(s));

    }

    @Test
    public void addTestWithOneArgument() throws Exception {

        String s = "1";
        assertEquals(1,calculator.add(s));
    }

    @Test
    public void addTestWithTwoArguments() throws Exception {
        String s = "10,20";
        assertEquals(30,calculator.add(s));

    }

    @Test
    public void addTestWithMultipleArguments() throws Exception {
        String s = "1,2,3,4,5,6,6";
        assertEquals(27,calculator.add(s));
    }

    @Test
    public void addTestWithNewLines() throws Exception {
        String s = "1\n2,4\n5";
        assertEquals(12,calculator.add(s));
    }

    @Test
    public void addTestWithCustomDelimiter() throws Exception {
        String s = "//s\n1s2\n4";
        assertEquals(7,calculator.add(s));

    }

    @Test
    public void addTestWithOneNegativeNumber() throws Exception {
        String s = "1,3,-1";
        try {
            calculator.add(s);
        } catch (Exception e){
            assertEquals("-1", e.getMessage().trim());
        }
    }

    @Test
    public void addTestWithMultipleNegativeNumbers() throws Exception {
        String s = "1,3,-1,-2";
        try {
            calculator.add(s);
        } catch (Exception e){
            assertEquals("-1 -2", e.getMessage().trim());
        }
    }

}
