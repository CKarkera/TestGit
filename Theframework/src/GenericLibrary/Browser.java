package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {
	
public static WebDriver d;
  @Parameters("browser")
  @Test
  public void Launch(String browser) {
	  if(Constant.browser.equalsIgnoreCase("firefox")){
		  d=new FirefoxDriver();
	  }
	  else if(Constant.browser.equalsIgnoreCase("chrome")){
		  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\LENOVO\\workspace\\September\\Theframework\\chromedriver.exe");
		  d=new ChromeDriver();
	  }
	  	d.manage().window().maximize();
		d.get("http://www.myntra.com");
		System.out.println(d.getTitle());
		System.out.println("Cross Browser TESTING Completed Successfully !!! :) :) :)");
  }
  
}
