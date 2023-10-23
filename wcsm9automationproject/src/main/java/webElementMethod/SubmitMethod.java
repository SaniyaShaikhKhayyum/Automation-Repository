package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("saniya");
		driver.findElement(By.name("pass")).sendKeys("1234567890");
		WebElement loginFB=driver.findElement(By.name("login"));
		 loginFB.submit();
		
	}

}
