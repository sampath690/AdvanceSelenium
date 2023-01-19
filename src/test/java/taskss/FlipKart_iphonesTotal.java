package taskss;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FlipKart_iphonesTotal {
	
  public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  driver.findElement(By.name("q")).sendKeys("iphones");
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  Thread.sleep(2000);
	  
	  WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  int sum=0,n=422;
	  String s1=null,s2=null;
	  while(n>sum) {
		  
		  List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		  List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		  int n1=name.size();
		  for(int i=1;i<=n1;i++) {
			  System.out.print(name.get(i-1).getText()+"\t"+price.get(i-1).getText()+"\n");
		  }
		
		sum=sum+n1;
		if(n==sum) {
			driver.quit();
			System.exit(0);
			
		}
		js.executeScript("arguments[0].click()", next);
		Thread.sleep(2000);
		  
		  
		  
	  }
	  
	  }
         
	
}

