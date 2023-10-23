package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://saklen/login.do");
		WebElement clk=driver.findElement(By.name("remember"));
		boolean status = clk.isSelected();
		System.out.println(status);
		clk.click();
		boolean status1 = clk.isSelected();
		System.out.println(status1);
		
		
	}

}
