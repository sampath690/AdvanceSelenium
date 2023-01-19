package chrome_Options;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito_Mode {
  public static void main(String[] args) {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--incognito");
	  
	   
	WebDriver driver=new ChromeDriver(option);
	//driver.manage().window().maximize();
	driver.get("https://www.yatra.com/");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
