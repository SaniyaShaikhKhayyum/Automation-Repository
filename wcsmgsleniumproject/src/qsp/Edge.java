package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("open the edge");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Edge is close");
		
	}

}
