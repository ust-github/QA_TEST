package qa_test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App1.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue( true );
    }
}
