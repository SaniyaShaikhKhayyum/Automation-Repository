package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrainLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable notification");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("PUNE");
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-9 ui')]")).sendKeys("mubai");
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c58-10')]")).sendKeys("");
		
		//driver.findElement(By.
	}

}
