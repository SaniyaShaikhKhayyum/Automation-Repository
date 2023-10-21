package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://saklen/login.jsp");
		String loginPageSourceCode=driver.getPageSource();
		System.out.println(loginPageSourceCode);
		Thread.sleep(2000);
		driver.quit();
	}

}
