package methodOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Laptop HP");
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao'and (text()='Brand')]"));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV'and(text()='HP')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_3-PJz-']"));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Ryzen 5 Octa Core')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']"));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 11 Home']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Customer Ratings')]"));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='4★ & above')]")).click();
		Thread.sleep(2000);
		List<WebElement> allLaptop=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement>allprice=driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor:://div[@class='_3pLy-c row']//descendant//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0;i<allLaptop.size();i++)
		{
			String laptop=allLaptop.get(i).getText();
			Thread.sleep(2000);
			for(int j=i;j<i;j++)
			{
				String price=allprice.get(i).getText();
				Thread.sleep(2000);
				System.out.println(laptop+" :"+price);
			}
		}
	}


}
