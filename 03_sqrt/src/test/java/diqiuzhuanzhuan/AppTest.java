package diqiuzhuanzhuan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testSqrt()
    {
        App app = new App();
        assertTrue(app.sqrt(0.0) - 0.0 < 0.001);
        assertTrue(app.sqrt(1.0) - 1.0 < 0.001);
        assertTrue((app.sqrt(2.0) - 1.414141414) < 0.01);

    }
}
