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
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		// more options
//		URL driverLocation = new URL("http://remote.webdriver.lives.here:4444/wd/hub");
//		driver = new RemoteWebDriver(driverLocation, options);
		driver = new ChromeDriver();
	}
    public void Azure()
    {
        System.out.println( "Test cases started" );
        driver.get("https://www.meta.com/");
        driver.quit();
    }
}
