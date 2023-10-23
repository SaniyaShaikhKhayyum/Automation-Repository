package dropDownMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		//identify dropdown
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.partialLinkText("Multi Select")).click();
		WebElement dropdown1=driver.findElement(By.xpath("//select[contains(@class,' ease-linear transition-all duration-150 w-5/12')]"));
		 Select sel = new Select(dropdown1);
		 //select the option
		 sel.selectByIndex(2);
		 Thread.sleep(2000);
		 sel.deselectByIndex(2);
		 for(int i=0;i<=4;i++)
		 {
			 Thread.sleep(2000);
			sel.selectByIndex(i);
		 }
		 Thread.sleep(2000);
		 for(int i=0;i<=4;i++)
		 {
			// Thread.sleep(2000);
			 sel.deselectByIndex(i);
		 }
				 
		
	}

}
