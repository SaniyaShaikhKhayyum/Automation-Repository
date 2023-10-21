package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyParentCloseMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//how to close only parent browser.
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		String parentHandle=driver.getWindowHandle();
		System.out.println("address of parant browser or windows" +parentHandle);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		 java.util.Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(parentHandle.equals(wh))
			{
				System.out.println("address of child window :"+wh);
			 TargetLocator switchTo = driver.switchTo();
			driver.switchTo().window(wh).manage().window().maximize();
			Thread.sleep(2000);
			switchTo.window(wh).close();
			}
			else
			{
				System.out.println("address of parent window :" +wh);
			}
		}
	driver.close();
		
	}
	



	}


