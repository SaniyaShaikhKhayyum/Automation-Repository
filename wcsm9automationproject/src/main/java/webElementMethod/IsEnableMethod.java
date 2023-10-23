package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//button[contains (@class,'_acan _acap _acas _aj1-')] "));
		boolean status = login.isEnabled();
		System.out.println(status);
		login.click();
		boolean status2 = login.isEnabled();
		System.out.println(status2);
		
		
		
	}

}
