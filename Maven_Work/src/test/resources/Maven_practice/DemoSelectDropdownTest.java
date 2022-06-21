package Maven_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoSelectDropdownTest {
	@Test
	public void select() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		
		Select s=new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		s.selectByVisibleText("Name: A to Z");
		Thread.sleep(2000);
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		s1.selectByVisibleText("Name: Z to A");
		Thread.sleep(2000);
		Select s2=new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		s2.selectByVisibleText("Price: Low to High");
		Thread.sleep(2000);
		Select s3=new Select(driver.findElement(By.xpath("//select[@id='products-orderby']")));
		s3.selectByVisibleText("Price: High to Low");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}