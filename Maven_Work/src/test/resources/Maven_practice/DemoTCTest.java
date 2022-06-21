package Maven_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTCTest {
	@Test
	public void login(){
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		/*driver.findElement(By.id("Email")).sendKeys("kaddi123@gmail.com");  //gkgkadg123@gmail.com
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		*/
		if(driver.findElement(By.xpath("//a[text()='Register']")).isDisplayed()){
			System.out.println("Pass: test case is pass");
		}
		driver.close();
		
	}

}
