package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependanceXpaath {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	//search box and pass mobile
	driver.findElement(By.name("q")).sendKeys("Mobile");
	//identified search icon and click
	driver.findElement(By.xpath("//button[contains(@aria-label,' Brands and More')]")).click();
	String price=driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::/div[@class='_30jeq3 _1_WHN1']/desendant::/div[@class='_3LWZlK'][2])")).getText();
	System.out.println(price);
	
	}

}
