package sychronaizationPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraExplicit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shoes for man");

		driver.findElement(By.xpath("//button[contains(@title='Search')]")).click();
		String parentHandle=driver.getWindowHandle();

	Set<String> allhandles=driver.getWindowHandles();
		for(String wh : allhandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			//Thread.sleep(2000);
			driver.findElement(By.xpath("(//img[@class='colors-image'])[1]")).click();
			driver.findElement(By.xpath("//button[@class=\"size-buttons-size-button-selected size-buttons-size-button size-buttons-size-button-default\"]")).click();
			driver.findElement(By.partialLinkText("256 GB")).click();
			driver.findElement(By.xpath("//input[@name='pincode']")).clear();
			driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("411033");
			driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
			driver.findElement(By.xpath("//a[@class='pdp-goToCart pdp-add-to-bag pdp-button pdp-flex pdp-center ']")).click();
			
			
		}
		
		
	}

}
