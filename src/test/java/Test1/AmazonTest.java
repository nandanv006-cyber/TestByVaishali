package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonTest {
	
	@Test
	public void findMarati()
	{
		//button[@type='submit']
		//div[@id='nav-flyout-icp']//span[@dir='ltr'][contains(text(),'मराठी')]
		//div[@id='nav-flyout-icp']//i[@class='icp-radio icp-radio-active']
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'EN')]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		WebElement element2 = driver.findElement(By.xpath("//div[@id='nav-flyout-icp']//span[@dir='ltr'][contains(text(),'मराठी')]"));
	}
}
