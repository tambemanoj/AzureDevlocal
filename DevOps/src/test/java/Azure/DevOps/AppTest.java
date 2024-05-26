package Azure.DevOps;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;



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
    	App ap = new App();
    	ap.Azure();
        assertTrue( true );
    }
}
