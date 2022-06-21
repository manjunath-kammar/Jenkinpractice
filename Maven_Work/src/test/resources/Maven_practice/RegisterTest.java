package Maven_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test
	public void RigisterTc(){
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String tit=driver.getTitle();
		if(tit.contains("Demo"))
		{
			System.out.println("Pass: Demo web page is displayed");
		}
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
		String title=driver.getTitle();
		if(title.contains("Demo")){
			System.out.println("Pass:Its contain title as register");
		}
		String FN="manju";
		String LN="KAMMAR";
		String email="anna12344@gmail.com";
		String pwd="123456";
		String cpwd=pwd;
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("register-button")).click();
		if(driver.findElement(By.className("ico-logout")).isDisplayed())
		{
			System.out.println("Pass: registration is successful");
		}
		driver.close();
		driver.quit();
		
		
	}

	}


