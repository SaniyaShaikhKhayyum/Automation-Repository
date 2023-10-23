package sychronaizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkardExplicit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		String parentHandle=driver.getWindowHandle();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	Set<String> allhandles=driver.getWindowHandles();
		for(String wh : allhandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
				driver.findElement(By.partialLinkText("256 GB")).click();
				driver.findElement(By.id("pincodeInputId")).clear();
				driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
				driver.findElement(By.xpath("//span[text()='Check']")).click();
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
			
		}
		//Thread.sleep(2000);
		
	}

}
