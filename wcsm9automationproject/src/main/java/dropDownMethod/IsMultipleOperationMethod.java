package dropDownMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleOperationMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//identify ph no dropdow
		WebElement dropdown1=driver.findElement(By.xpath("//select[contains(@class,' ease-linear transition-all duration-150 w-5/12')]"));
		 Select sel = new Select(dropdown1);
		 
		 //select the option
		 sel.selectByIndex(2);
		 Thread.sleep(2000);
		 driver.findElement(By.name("ph")).sendKeys("9209197582");
		 WebElement Gn=driver.findElement(By.xpath("//label[text()='Gender']/following-sibling::select"));
		 Select s= new Select(Gn);
		 boolean im = sel.isMultiple();
		 System.out.println(im);
		 s.selectByVisibleText("Female");
		 //identify the countary dropdown
		 WebElement sel2=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		 Select sel3=new Select(sel2);
		 sel3.selectByValue("India");
		 boolean im1 = sel3.isMultiple();
		 System.out.println(im1);
		 WebElement dropdown3=driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		 Select sel4=new Select(dropdown3);
		 //Thread.sleep(2000);
		sel4.selectByVisibleText("Maharashtra");
		 //System.out.println(status3);
		 WebElement dropdown4=driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		 Select sel5=new Select(dropdown4);
		// Thread.sleep(2000);
		sel5.selectByVisibleText("Mumbai");
		 	 
		 
	}

}
