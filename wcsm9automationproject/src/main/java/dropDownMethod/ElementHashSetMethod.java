package dropDownMethod;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementHashSetMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shaik/OneDrive/Desktop/html%20code/SingleSelectDropdown.html");
		WebElement dropdown=driver.findElement(By.id("idddd"));
		Select sel=new Select(dropdown);
		List<WebElement> all = sel.getOptions();
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0;i<all.size();i++)
		{
			WebElement op=all.get(i);
			String dropdown1=op.getText();
			System.out.println(dropdown1);
			Thread.sleep(2000);
			hs.add(dropdown1);
		}
		Thread.sleep(2000);
		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
		
	}

}
