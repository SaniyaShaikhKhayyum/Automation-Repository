package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SheroppersstackLogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("saniyashaikhssh@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Saniya@1996");
		driver.findElement(By.xpath("//span[@class='MuiButton-label' and (text()='Login')]"));
		//driver.findElement(By.xpath("MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z")).click();
		
	}

}
