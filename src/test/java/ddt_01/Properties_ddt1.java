package ddt_01;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_ddt1 {
    public static void main(String[] args) throws IOException {
	 FileInputStream file=new FileInputStream("./src/test/resources/common.properties");
	 Properties p=new Properties();
	 p.load(file);
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(p.getProperty("time"))));
	 driver.get(p.getProperty("url"));
	 
	 driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']")).sendKeys(p.getProperty("user"));
	 driver.findElement(By.name("password")).sendKeys(p.getProperty("password"));
	 
	 
}
}
