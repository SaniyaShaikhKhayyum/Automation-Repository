package dropDownMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementOperationalMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shaik/OneDrive/Desktop/html%20code/MultipleSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.id("idddd"));
		Select sel=new Select(dropdown);
		WebElement all=sel.getWrappedElement();
		System.out.println(all);
		Thread.sleep(2000);
		System.out.println(all.getText());
		//Thread.sleep(2000);
		List<WebElement> option = sel.getOptions();
		//Thread.sleep(2000);
		for(WebElement op:option)
		{
			Thread.sleep(2000);
			System.out.println(op.getText());
		}
		Thread.sleep(2000);
		for(WebElement op:option)
		{
			Thread.sleep(2000);
			if(op.getText().equals("vadapav"))
			{
				op.click();
			}
		}
	}

}
