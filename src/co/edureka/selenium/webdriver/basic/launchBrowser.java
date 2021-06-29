package co.edureka.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.pom.Base;

public class LaunchBrowser extends Base{
	
	public static WebDriver driver =  null;
	
	public LaunchBrowser(WebDriver driver) {
		
		String amazonUrl = "https://amazon.in";

        String driverPath = ".\\driver\\chromedriver.exe";
        String chromeDriver = "webdriver.chrome.driver";
        System.setProperty(chromeDriver, driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         
       //Navigate the web Application
        driver.navigate().to(amazonUrl);
        driver.manage().window().maximize();
        String title = driver.getTitle();
         
        if(title.equalsIgnoreCase("Amazon.in"))
        System.out.println("Title matches");
        else 
        	 System.out.println(title); 
	}	       
 }
