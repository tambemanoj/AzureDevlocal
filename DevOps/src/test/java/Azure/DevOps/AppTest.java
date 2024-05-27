package Azure.DevOps;



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
    	try {
    	App ap = new App();
    	ap.Azure();
    	}
       catch(Exception ex) {
    	   System.out.println(ex.toString());
       }
    }
}
