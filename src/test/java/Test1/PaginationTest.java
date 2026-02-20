package Test1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PaginationTest {
	
	@Test
	public  void findEreader() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele = driver.findElement(By.id("Stats1"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		
		
//		//td[normalize-space()='Smartphone']
		//div[@class="table-container"]//tr
		
		Thread.sleep(5);
		int count = 1;
		
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
		for(WebElement page:pages)
		{
			Thread.sleep(5);
			List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='table-container']//tr//td"));
			for(WebElement need:ele2)
			{
				Thread.sleep(2);
				String text = need.getText();
				System.out.println(text);
				if(text.contains("E-Reader"))
				{
					driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
				}
			}
		page.click();	
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
		}
		List<WebElement> ele2 = driver.findElements(By.xpath("//div[@class='table-container']//tr//td"));
		for(WebElement need:ele2)
		{
			driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
			Thread.sleep(2);
			String text = need.getText();
			System.out.println(text);
			if(text.contains("E-Reader"))
			{
				driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
			}
		}
		
		
		
		
		
		
		
		
		
		
//		for(int i=1;i<10;i++) 
//		{
//		List<WebElement > ele2 = driver.findElements(By.xpath("//div[@class='table-container']//tr"));
//		for(WebElement row:ele2)
//		{
//			String text = row.getText();
//			
//			try {
//				count++;
//				driver.findElement(By.xpath("//td[normalize-space()='E-Reader']"));
//				
//				}
//			catch (Exception e) 
//			{
//				
//				driver.findElement(By.xpath("//ul[@id='pagination']//a"));
//			}
////			driver.findElement(By.xpath("//td[normalize-space()='E-Reader']"));
//		
//		}
		
		
	}
	}
	

