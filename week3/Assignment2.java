package testleaf.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("accountName")).sendKeys("Aravinth Madhavan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement element = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select s=new Select(element);
		s.selectByVisibleText("Computer Software");
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select s1=new Select(element2);
		s1.selectByVisibleText("S-Corporation");
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select s2=new Select(element3);
		s2.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select s3=new Select(element4);
		s3.selectByIndex(6);
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s4=new Select(element5);
		s4.selectByValue("TX");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
