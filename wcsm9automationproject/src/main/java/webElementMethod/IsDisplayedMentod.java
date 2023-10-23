package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMentod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://saklen/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("remember")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		WebElement logout = driver.findElement(By.partialLinkText("Logout"));
		boolean status = logout.isDisplayed();
		System.out.println(status);
		
		
		
		                            
}

}
