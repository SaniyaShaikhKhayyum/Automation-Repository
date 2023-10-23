package webElementMethod;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario {
	static WebDriver driver;
	private Object system;
	Scanner sc=new Scanner(system.in);
	String browser=sc.next();
	public static void main(String[] args) {
	
	if(Browser.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("this is not a browservalue");
	}
	
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	
}
	public static void SearchProduct(String product)
	{
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(product);
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search")).sendKeys("apple watch");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("")).click();
	}

}
