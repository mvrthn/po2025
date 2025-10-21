import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void firstHalf() {
        assertEquals("Woo", CodingBat.firstHalf("WooHoo"));
        assertEquals("Hello", CodingBat.firstHalf("HelloThere"));
        assertEquals("abc", CodingBat.firstHalf("abcdef"));
    }

    @org.junit.Test
    public void countYZ() {
        assertEquals(2, CodingBat.countYZ("fez day"));
        assertEquals(2, CodingBat.countYZ("DAY abc XYZ"));
    }

    @Test
    public void sumDigits() {
        assertEquals(6, CodingBat.sumDigits("aa1bc2d3"));
        assertEquals(12, CodingBat.sumDigits("X1z9b2"));
    }

    @Test
    public void notReplace() {
        assertEquals("is not test", CodingBat.notReplace("is test"));
        assertEquals("isis", CodingBat.notReplace("isis"));
        assertEquals("AAAis is not", CodingBat.notReplace("AAAis is"));
    }
}