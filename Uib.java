package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Uib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("firstName")).sendKeys("suriyan");
		WebElement findElement=driver.findElement(By.id("title"));
		Select drop=new Select(findElement);
		drop.selectByValue("mr");
		driver.findElement(By.id("middleName")).sendKeys("kumar");
		driver.findElement(By.id("lastName")).sendKeys("S");
		WebElement findElement2 = driver.findElement(By.id("sex"));
		Select drop2=new Select(findElement2);
		drop2.selectByValue("male");
		WebElement findElement3 = driver.findElement(By.id("employmentStatus"));
		Select drop3=new Select(findElement3);
		drop3.selectByValue("Unemployed");
		driver.findElement(By.id("username")).sendKeys("surii");
		driver.findElement(By.id("email")).sendKeys("ssn150902@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sooriiip");
		driver.close();
		
		
		

	}

}
