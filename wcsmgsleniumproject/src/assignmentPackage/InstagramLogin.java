package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		//identify usernameTextbox and pass inputs
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("saniyashaikh");
		//identify passwordTextbox and pass inputs
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("123456");
		//identify loginButton and pass inputs
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}
