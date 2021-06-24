import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterAmazonPage extends Base{
	public RegisterAmazonPage(WebDriver driver) throws InterruptedException {
		  super(driver);
		 
		  //Locate a sign in button web element   
	        WebElement signInButton = driver.findElement(By.cssSelector("#nav-link-accountList > span"));
	        signInButton.click();
	        Thread.sleep(100);
		
	}
      
        
}
