package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMaethod1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Hiw to close all browser
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
