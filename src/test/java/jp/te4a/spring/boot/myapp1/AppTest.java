package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.assertEquals;
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
        HelloController he = new HelloController();
        String expect = he.index();
        String actual = "Hello Spring world";
        assertEquals(expect,actual);
    }
}