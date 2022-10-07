package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
          driver.manage().deleteAllCookies();
          
          

	}

}
