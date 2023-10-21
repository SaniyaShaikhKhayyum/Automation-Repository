package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistaraTravel {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("PNQ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("BOM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("return-radio")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("//a[@data-date='27']")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("//a[@data-date='28']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("passengers")).click();
		
		
		
		
	}

}
