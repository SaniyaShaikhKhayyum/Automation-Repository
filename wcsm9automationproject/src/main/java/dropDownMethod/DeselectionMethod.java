package dropDownMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/shaik/OneDrive/Desktop/html%20code/MultipleSelectDropdown.html");
		WebElement dropdown=driver.findElement(By.name("n1"));
		Select sel=new Select(dropdown);
		sel.selectByValue("V9");
		Thread.sleep(2000);
		//select & deslect option by using VisibleText
		sel.deselectByValue("v9");
		Thread.sleep(2000);
		sel.deselectByVisibleText("misal");
		sel.selectByVisibleText("misal");
		sel.deselectAll();
		
		
		
	}

}
