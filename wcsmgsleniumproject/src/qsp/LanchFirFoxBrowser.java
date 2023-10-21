package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchFirFoxBrowser {
	public static void main(String[] args) throws InterruptedException {
		//to launch Chrom we need cerate object of ChromeDriver()
		WebDriver driver=new FirefoxDriver();
		System.out.println("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.close();
	}

}
