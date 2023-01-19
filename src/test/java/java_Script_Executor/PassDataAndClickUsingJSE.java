package java_Script_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassDataAndClickUsingJSE {
  public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.location=arguments[0]", "https://www.amazon.com");
	Thread.sleep(2000);
	System.out.println(js.executeScript("return document.title"));
	
	WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
	js.executeScript("arguments[0].value=arguments[1]",searchTF,"iphones");
	Thread.sleep(2000);
	
	WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
	js.executeScript("arguments[0].click()", searchButton);
	Thread.sleep(2000);
	
	
	
	System.out.println(js.executeScript("return document.URL"));
}
}
