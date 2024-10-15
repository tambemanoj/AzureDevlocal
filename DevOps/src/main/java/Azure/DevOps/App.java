package Azure.DevOps;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.net.Urls;
/**
 * Hello world!
 *
 */
public class App 
{
	ChromeDriver driver = null;
	
	App(){
		driver = new ChromeDriver();
	}
    public void Azure()
    {
        System.out.println( "Test cases started" );
        driver.get("https://www.meta.com/");
        String a = driver.getTitle();
        System.out.println(a);
        if (a.equals("aa")) {
        	System.out.println("title matched");
        }
        driver.manage().window().maximize();
        
        driver.manage().window().fullscreen();
        driver.quit();
        
        
    }
}
