package dropDownMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectoptionMultiSelectMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("file:///C:/Users/shaik/OneDrive/Desktop/html%20code/MultipleSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.id("idddd"));
		Select sel=new Select(dropdown);
		for(int i=0;i<8;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		
		Thread.sleep(2000);
		System.out.println(((WebElement) sel.getAllSelectedOptions()).getText());
		
		
		
	}

}
