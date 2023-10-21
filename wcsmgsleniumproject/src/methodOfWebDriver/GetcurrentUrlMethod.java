package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://saklen/login.do");
		String urlOfLoginPage=driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);
		
		Thread.sleep(null);
		driver.quit();
	}

}
