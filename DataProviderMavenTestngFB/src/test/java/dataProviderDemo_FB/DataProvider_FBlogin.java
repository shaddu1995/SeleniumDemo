package dataProviderDemo_FB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_FBlogin {

	@Test(dataProvider="getData")
	public void login(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shraddha Nandagave\\eclipse-workspace\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		driver.get("https://facebook.com");
		Thread.sleep(2000);
		//enter emailid
		WebElement emailid= driver.findElement(By.id("email"));
		emailid.sendKeys(username);
		
		//enter password
		WebElement pwd= driver.findElement(By.id("pass"));
		pwd.sendKeys(password);
		
		Thread.sleep(2000);
		
		//click login button u_0_f
		WebElement loginButton= driver.findElement(By.id("u_0_b"));
		loginButton.click();
		
		Thread.sleep(2000);
		
		driver.close();
				

	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data= new Object[3][2];

		System.out.println("FetchingData");
		
		//user1
		data[0][0]="snandagave3@gmail.com";
		data[0][1]="SpunkyShaddu";
		
		//user2
		data[1][0]="snandagave3@gmail.com";
		data[1][1]="asdf";
	
		//user3
		data[2][0]="snandagave3@gmail.com";
		data[2][1]="Shaddu";


		return data;

	}
}
