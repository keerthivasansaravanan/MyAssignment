package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("keerthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("vasan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8838995224");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Suriyan@5");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		driver.findElement(By.xpath("//option[@value='2']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		driver.findElement(By.xpath("//option[text()='Jan']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		driver.findElement(By.xpath("//option[@value='2022']")).click();
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.close();
		
		
		;

	}

}
