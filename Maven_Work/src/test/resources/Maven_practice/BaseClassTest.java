package Maven_practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseClassTest  {

	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void open(@Optional("chrome") String browser){
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
		else if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
		
	}
	@AfterClass
	public void close(){
		driver.close();

		
	}

}
