package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://saklen/login.do");
		Thread.sleep(2000);
		WebElement userTB=driver.findElement(By.name("username"));
		userTB.sendKeys("admin");
		Thread.sleep(2000);
		WebElement passTB=driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.name("remember")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
