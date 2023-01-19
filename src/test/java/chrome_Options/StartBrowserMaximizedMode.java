package chrome_Options;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartBrowserMaximizedMode {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		   ChromeOptions str = option.addArguments("start-maximized","--disable-notifications");
		  // option.addArguments("--disable-notifications");
		   str.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(option);
		//driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
