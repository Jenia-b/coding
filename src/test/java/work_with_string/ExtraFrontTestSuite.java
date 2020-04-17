package work_with_string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtraFrontTestSuite {
    @Test
    public void test1() {
        assertEquals("", ExtraFront.extraFront(""));
    }

    @Test
    public void test2() {
        assertEquals("HHH", ExtraFront.extraFront("H"));
    }

    @Test
    public void test3() {
        assertEquals("ababab", ExtraFront.extraFront("ab"));
    }

    @Test
    public void test4() {
        assertEquals("HeHeHe", ExtraFront.extraFront("Hello"));
    }

}
