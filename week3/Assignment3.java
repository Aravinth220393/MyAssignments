package testleaf.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aravinth");
		driver.findElement(By.name("lastname")).sendKeys("Madhavan");
		driver.findElement(By.name("reg_email__")).sendKeys("7305395839");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");
		WebElement element = driver.findElement(By.id("day"));
		Select s1=new Select(element);
		s1.selectByValue("22");
		WebElement element1 = driver.findElement(By.id("month"));
		Select s2=new Select(element1);
		s2.selectByValue("3");
		WebElement element2 = driver.findElement(By.id("year"));
		Select s3=new Select(element2);
		s3.selectByValue("1993");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
