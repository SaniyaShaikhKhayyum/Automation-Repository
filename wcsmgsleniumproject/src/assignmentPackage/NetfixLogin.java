package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetfixLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("saniyashaikhssh@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("Saniya@1996");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
