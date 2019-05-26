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
    public void test_add() {
        assertEquals(3, new App().add(1, 2));
        assertEquals(0, new App().add(1, -1));
        assertEquals(-4, new App().add(1, -5));
    }
}
