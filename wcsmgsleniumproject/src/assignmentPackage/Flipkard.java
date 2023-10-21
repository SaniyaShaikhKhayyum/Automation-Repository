package assignmentPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/travel/flights?param=FKHPtravelHPWEMIfederal1299off3023asqwwe");
		Thread.sleep(2000);
		
	}

}
