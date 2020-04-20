package work_with_warmup.first_level;

import org.junit.Assert;
import org.junit.Test;

public class Makes10TestSuite {
    @Test
    public void test1() {
        Assert.assertTrue(Makes10.makes10(1, 9));
    }

    @Test
    public void test2() {
        Assert.assertTrue(Makes10.makes10(10, 9));
    }

    @Test
    public void test3() {
        Assert.assertTrue(Makes10.makes10(10, 10));
    }

    @Test
    public void test4() {
        Assert.assertFalse(Makes10.makes10(1, 2));
    }
}
