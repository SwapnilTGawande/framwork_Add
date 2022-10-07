package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verififytest_01 {

	public static void main(String[] args) {
		String path = "C:\\Users\\Asus\\eclipse-workspace\\Project_Batch_8\\Driver\\chromedriver_win32\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", path);
	
	WebDriver driver=new ChromeDriver();
	  driver.get("https://web.whatsapp.com/");
	  driver.manage().window().maximize();
	 String currenturl=driver.getCurrentUrl();
      System.out.println(currenturl); 
      String title =driver.getTitle();
      System.out.println(title);
      driver.close();
	}

}
