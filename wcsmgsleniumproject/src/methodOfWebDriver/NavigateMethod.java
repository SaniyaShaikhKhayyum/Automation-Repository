package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		 //WebDriver driver=new ChromeDriver();
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Navigation nav=driver.navigate();
			nav.to("https//www.selenium.div");
			Thread.sleep(2000);
			nav.back();
			Thread.sleep(2000);
			nav.forward();
			Thread.sleep(2000);
			nav.refresh();
			Thread.sleep(2000);
			
			
	}

}
