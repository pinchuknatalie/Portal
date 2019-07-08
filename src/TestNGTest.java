
 

	import org.testng.annotations.Test;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;

	public class TestNGTest 
	{
	WebDriver driver;
	String url = "*project's URL*";

	@Test (priority = 0)
	public void IO_login() 
	{

	    //ForSe test environment URL
	    driver.navigate().to("Url");

	    //this is official email address of IO
	    driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys("*email address*");

	    //this is password
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("*Password*");

	    //click on submit button to login
	    driver.findElement(By.xpath("//*[@id='login-form']/div[4]/button")).click();
	    System.out.println("Login button pressed");
	}

	@BeforeTest
	public void setup() 
	{
	    // Set property for Chrome

	    System.setProperty("webdriver.chrome.driver","*my path*");

	    driver = new ChromeDriver();

	    //apply implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    //maximize window
	    driver.manage().window().maximize();
	}
	}
