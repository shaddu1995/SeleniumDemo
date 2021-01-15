package dataProviderDemo_FB;

import java.awt.Robot;
import java.awt.event.InputEvent;
//import java.awt.Robot;
//import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebookLogin {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha Nandagave\\eclipse-workspace\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		driver.get("https://facebook.com");
		Thread.sleep(2000);

	}

	@Test
	public void login() throws InterruptedException {

		//enter emailid
		WebElement emailid= driver.findElement(By.id("email"));
		emailid.sendKeys("snandagave3@gmail.com");
		System.out.println("email entered");

		//enter password
		WebElement pwd= driver.findElement(By.id("pass"));
		pwd.sendKeys("SpunkyShaddu");
		System.out.println("pwd entered");

		Thread.sleep(2000);

		//click login button u_0_f
		WebElement loginButton= driver.findElement(By.id("u_0_b"));
		loginButton.submit();
		System.out.println("click login");
		Thread.sleep(5000);
		
		
		Thread.sleep(2000);
		try {
		Robot robo= new Robot();
		robo.mouseMove(460,97);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);		
		System.out.println("mouse event occured : robt class");
		
		}catch(Exception e) {
			System.out.println("can not close popup");
		}
		
		Thread.sleep(5000);
		System.out.println("came to an end!");
		WebElement select= driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]"));
		select.click();
		Thread.sleep(5000);
		WebElement logOut= driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"));
		logOut.click();
		Thread.sleep(5000);
		System.out.println("successful:LOGOUT!");
	}
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
