package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.*;

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
    public void helloSpringWorldTest()
    {
        HelloController hc = new HelloController();
        String expected = "Hello. Spring Boot!";
        String actual = hc.index();
        assertEquals(actual, expected);
    }
}
