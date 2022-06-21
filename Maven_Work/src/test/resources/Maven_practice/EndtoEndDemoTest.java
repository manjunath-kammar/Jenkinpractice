package Maven_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndtoEndDemoTest extends BaseClassTest {
	
	@Test
	
	public void Addtocart() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		 //driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		 driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']")).click();
		 driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		// driver.switchTo();
		// driver.findElement(By.xpath("//span[@title='Close']")).click();
		 //Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		 if(driver.findElement(By.xpath("//a[text()='Edit']")).isDisplayed()){
			 System.out.println("pass: test case is pass");
		 }
	}
	
	/*@AfterClass
	public void close(){
		driver.close();
	}

*/}
