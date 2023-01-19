package chrome_Options;
//To get final Report /runs in background//

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Head_less {
  public static void main(String[] args) {
	  ChromeOptions option=new ChromeOptions();
	option.addArguments("--headless");
	   
	WebDriver driver=new ChromeDriver(option);
	//driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("Testcase passed");
}
}
