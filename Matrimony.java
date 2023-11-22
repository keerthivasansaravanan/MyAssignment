package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications","start-maximized");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.tamilmatrimony.in/");
		WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
		Select sle=new Select(findElement);
		sle.selectByValue("1");
		driver.findElement(By.id("NAME")).sendKeys("Suriyan");
		driver.findElement(By.xpath("//input[@class='hp-gender']")).click();
		driver.findElement(By.xpath("//select[@id='DOBDAY']")).click();
		driver.findElement(By.xpath("//option[@value='6']")).click();
		driver.findElement(By.xpath("//select[@name='DOBMONTH']")).click();
		driver.findElement(By.xpath("//option[@value='12']")).click();
		driver.findElement(By.xpath("//select[@name='DOBYEAR']")).click();
		driver.findElement(By.xpath("//option[@value='1999']")).click();
		driver.findElement(By.xpath("//select[@name='RELIGION']")).click();
		driver.findElement(By.xpath("//option[@value='1']")).click();
		driver.findElement(By.xpath("//select[@name='MOTHERTONGUE']")).click();
		driver.findElement(By.xpath("//option[@value='47']")).click();
		driver.findElement(By.xpath("//select[@name='COUNTRY']")).click();
		driver.findElement(By.xpath("//option[@value='98']")).click();
		driver.findElement(By.id("MOBILENO")).sendKeys("8838995224");
		driver.findElement(By.id("EMAIL")).sendKeys("ssn150902@gmail.com");
		driver.close();
		
		
		

	}

}
