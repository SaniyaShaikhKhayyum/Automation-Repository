package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://saklen/login.do");
		Thread.sleep(2000);
		WebElement userTB=driver.findElement(By.name("username"));
		userTB.sendKeys("admin");
		WebElement passTB=driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
