package dropDownMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSElectOptionOperationalMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shaik/OneDrive/Desktop/html%20code/MultipleSelectDropdown.html");
		WebElement manu=driver.findElement(By.id("idddd"));
		Select sel = new Select(manu);
		//select the multiple option by manu
		for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		//read the select options from manu dropdown
		List<WebElement> all = sel.getAllSelectedOptions();
		for(int i=0;i<=all.size();i++)
		{
			String op=all.get(i).getText();
			Thread.sleep(2000);
			System.out.println(op);
		}
	}

}
