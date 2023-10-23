package dropDownMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionOperationalMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//identify ph no dropdow
		WebElement dropdown1=driver.findElement(By.xpath("//select[contains(@class,' ease-linear transition-all duration-150 w-5/12')]"));
		 Select sel = new Select(dropdown1);
		 List<WebElement> all = sel.getOptions();
		 //we read list by using for loop
		 for(int i=0;i<=all.size();i++)
		 {
			 String opt = all.get(i).getText();
			 Thread.sleep(2000);
			 System.out.println(opt);
		 }
		 
		//we read list by using for each loop
	//	 for(WebElement op:all)
		 //{
			// String opt1 = op.getText();
			 //Thread.sleep(2000);
			 //System.out.println(opt1s);
		 //}
	}

}
