package javafortesters;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyFirstTest {
    @Test
    public void CanAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer);
    }
    @Test
    public void CanSubtractTwoMinusTwo(){
        int answer = 2-2;
        assertEquals("2-2", 0, answer);
    }
    @Test
    public void CanDivideFourByTwo(){
        int answer = 4/2;
        assertEquals("4/2",2, answer);
    }
    @Test
    public void CanMultiplyTwoTimesTwo(){
        int answer = 2*2;
        assertEquals("2*2", 4, answer);
    }
}
