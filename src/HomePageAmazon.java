import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.pom.Base; 

public class HomePageAmazon extends Base{ 
	
	private WebDriver driver;
	public HomePageAmazon(WebDriver driver) throws InterruptedException
	{ 
		this.driver = driver;
		String automationDemoSiteUrl = "http://demo.automationtesting.in/Frames.html";	
		//Locate a web element menu all    
	    WebElement hamburgerIcon = driver.findElement(By.cssSelector("#nav-hamburger-menu"));
	    hamburgerIcon.click();
	    Thread.sleep(100);
	     
	   //Drop-down menu see all
	    WebElement seeAll = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(20) > a.hmenu-item.hmenu-compressed-btn > i"));
	    seeAll.click();
	    Thread.sleep(100);
	     
	   //Click on the option books
	    WebElement Books = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > ul > li:nth-child(7) > a"));
	    Books.click();
	    Thread.sleep(100);
	     
	   //Click on the option fiction books         
	    WebElement fictionBooks = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(4) > a"));
	    fictionBooks.click();
	    Thread.sleep(100);
	     
	   //Find a book by John Grisham        
	    WebElement myElement=driver.findElement(By.id("twotabsearchtextbox"));
	    myElement.sendKeys("John Grisham");
	     
	     driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
	     Thread.sleep(2000);
	     
	   //Select the book        
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[1]/div/div/span/a/div")).click();
	    Thread.sleep(2000);
	     
	   //Shift the tab control     
	    java.util.Set<String> handles = driver.getWindowHandles();
	    String WinHandle1 = driver.getWindowHandle();
	    handles.remove(WinHandle1);
	     
	    String winHandle = handles.iterator().next();
	    String winHandle2 = "";
	    
	    if (winHandle != winHandle2)
	    {
	       winHandle2 = winHandle;
			driver.switchTo().window(winHandle2);
			System.out.println(winHandle2);
	    } 
	     
	    Thread.sleep(2000);
	     
	    //Add to cart 
	    WebElement addToCart  = driver.findElement(By.cssSelector("#add-to-cart-button"));
	    addToCart.click();
	    Thread.sleep(5000);
	    
	    //Scroll the web page till end        
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    Thread.sleep(3000);
	     
	    //Typing hey on the automationDemoSite "hey"         
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    WebElement frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	    driver.switchTo().frame(frame);
	    Thread.sleep(2000);
	     
	    WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	    textbox.sendKeys("hey");
	    Thread.sleep(3000);
	     
	    driver.close();
	    driver.quit();
		} 
	

	}



