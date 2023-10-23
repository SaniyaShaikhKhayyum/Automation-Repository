package dropDownMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstselectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shaik/OneDrive/Desktop/html%20code/SingleSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.id("idddd"));
		Select sel=new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByValue("v7");
		Thread.sleep(2000);
		WebElement first = sel.getFirstSelectedOption();
		System.out.println(first.getText());
		
		
	}

}
