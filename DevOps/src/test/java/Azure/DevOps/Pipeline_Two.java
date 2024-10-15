package Azure.DevOps;

import org.testng.annotations.Test;

public class Pipeline_Two {

	@Test
	public void run() {
		System.out.println("Pipeline 2");
		try {
	    	App ap = new App();
	    	ap.Azure();
	    	}
	       catch(Exception ex) {
	    	   System.out.println(ex.toString());
	       }
	}
}
