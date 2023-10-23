package webElementMethod;

import java.awt.Point;
//import org.openqa.selenium.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocator_GetSize_GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		WebElement emailtextBox = driver.findElement(By.cssSelector("input#email"));
		org.openqa.selenium.Point loc = emailtextBox.getLocation();
		 int xaxis = loc.getX();
		 int yaxis=loc.getY();
		 System.out.println("location of emailtextBox:" +xaxis+":"+yaxis);
		 //get the size of email textBox
		 Dimension size=emailtextBox.getSize();
		 int height=size.getHeight();
		 int width=size.getWidth();
		 System.out.println("size of email textbox :"+height+":"+width);
		 //get the rect of email
		 Rectangle rect = emailtextBox.getRect();
		 System.out.println(rect.getX()+":"+rect.getY());
		 System.out.println(rect.getHeight()+":"+rect.getWidth());
		 
		 
		 
		
	}

}
