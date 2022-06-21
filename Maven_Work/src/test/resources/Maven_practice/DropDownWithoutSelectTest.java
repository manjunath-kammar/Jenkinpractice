package Maven_practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDownWithoutSelectTest {
	@Test
	public void choose() throws AWTException, InterruptedException{ 
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		/*WebElement  elf= driver.findElement(By.xpath("//select[@id='products-orderby']"));
		elf.sendKeys(Keys.ENTER);
		elf.sendKeys(Keys.ARROW_DOWN);
		elf.sendKeys(Keys.ENTER);
		driver.close();*/
		WebElement  elf1= driver.findElement(By.xpath("//select[@id='products-orderby']"));
		elf1.click();
		Robot robot=new Robot();
		for(int i=0;i<5;i++){
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			
		}
	
		driver.close();
		
	}

}

