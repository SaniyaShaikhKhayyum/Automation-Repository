package webElementMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_GetCssValue_GetTagName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//get the get attribute of username textBox   
		WebElement  usrTB=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		String attributevalue=usrTB.getAttribute("class");
		System.out.println(attributevalue);
		//get the CSSValue property of textBox
		String cssvalue=usrTB.getCssValue("color");
		System.out.println(cssvalue);
		//get the TagName of username textbox
		String tag=usrTB.getTagName();
		System.out.println(tag);
		
		
	}

}
