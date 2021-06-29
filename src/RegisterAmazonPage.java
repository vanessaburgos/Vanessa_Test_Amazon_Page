import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.project.pom.Base;

public class RegisterAmazonPage extends Base{
	
	By signInButton = By.cssSelector("#nav-link-accountList > span");
	By emailTextBox = By.cssSelector("#ap_email");
	By buttonContinue = By.cssSelector("div [class='a-button a-button-span12 a-button-primary']");
	By passwordTextBox = By.cssSelector("#ap_password");
	By buttonSignIn = By.cssSelector("#signInSubmit");
	
	public RegisterAmazonPage(WebDriver driver) throws InterruptedException{
		  super(); 
		 		 
		  //Locate a sign in button web element   
	      WebElement signInButton = driver.findElement(By.cssSelector("#nav-link-accountList > span"));
	      Base base = new Base();
	      signInButton.click();
	      
	      //Enter email
	        WebElement emailTextBox=driver.findElement(By.cssSelector("#ap_email"));
	        emailTextBox.sendKeys("vanessaburgos59@gmail.com");
	        
	       //Click button Continue 
	        WebElement buttonContinue = driver.findElement(By.cssSelector("div [class='a-button a-button-span12 a-button-primary']"));
	        buttonContinue.click();
		      Thread.sleep(100);
	        
	      //Enter password
	        WebElement passwordTextBox=driver.findElement(By.cssSelector("#ap_password"));
	        passwordTextBox.sendKeys("65342330v");
	        
		  //Click button sign in
	        WebElement buttonSignIn = driver.findElement(By.cssSelector("#signInSubmit"));
	        buttonSignIn.click();
		      Thread.sleep(100);
		
	}
	
	public void registerUser() throws InterruptedException
	{
		click(signInButton);
		Thread.sleep(2000);
		
		if(isDisplayed(signInButton)) 
		{
			type("vanessaburgos59@gmail.com", emailTextBox);			
		}
	}
	
	public void buttonContinue() throws InterruptedException
	{
		click(buttonContinue);
		Thread.sleep(2000);
	}
	
	public void enterPassword() throws InterruptedException
	{
		click(passwordTextBox);
		Thread.sleep(2000);
		
		if(isDisplayed(signInButton)) 
		{
			type("65342330v", passwordTextBox);			
		}
	}
	
	public void buttonSignIn() throws InterruptedException
	{
		click(buttonSignIn);
		Thread.sleep(2000);
	}
	
	
	public String registeredMessage() 
	{
		return "";
	}
}
