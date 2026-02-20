package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicWebTable {

	
	//td[normalize-space()='Chrome']
	//td[normalize-space()='7.5%']
	@Test
	public void cpu()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele = driver.findElement(By.id("laptops"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		String text= "Chrome";
		WebElement web = driver.findElement(By.id("//td[normalize-space()='"+text+"']|//table[@id='taskTable']//td[4]"));
		String real = web.getText();
		System.out.println(real);
		
	}
	//td[normalize-space()='Chrome']|//table[@id='taskTable']//td[4]
	@Test
	public void dynamic()
	{
		//tbody[@id='rows']//td
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele = driver.findElement(By.id("laptops"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		List<WebElement> elements = driver.findElements(By.xpath("//tbody[@id='rows']//td|//td[normalize-space()='%']"));
		
		
		//tagname[contains(@attribute,'value')]
		//tagname[contains(text(),'value')]
		for(WebElement tag :elements)
		{
			String text = tag.getText();
			System.out.println(text);
			String actual = "Chrome";
			if(text.equals(actual))
			{
				//td[normalize-space()='Chrome']|//td[normalize-space()='Chrome']//td[contains(text(),'%')]
				List<WebElement> g = driver.findElements(By.xpath("//td[normalize-space()='Chrome']|//td[normalize-space()='Chrome']//td[contains(text(),'%')]"));
			
			}
		}
		
		System.out.println("heyy");	
		System.out.println("heyy");	
		System.out.println("heyy");	
		System.out.println("heyy");	
	
	}


}


