package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1Method {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://saklen/login.do");
		WebElement use=driver.findElement(By.name("username"));
		System.out.println(use);
		use.sendKeys("admin");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		System.out.println(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	}

}
