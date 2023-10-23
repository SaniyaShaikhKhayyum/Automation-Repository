package webElementMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(null)
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allphone = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);
		for(WebElement phone:allphone)
		{
			System.out.println(phone.getText());
		}
	}

}
